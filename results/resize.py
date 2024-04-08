import os
from PIL import Image
import glob


def get_image_info(directory):
    png_files = glob.glob(os.path.join(directory, '*.png'))

    image_info = {}

    for png_file in png_files:
        try:
            with Image.open(png_file) as img:
                width, height = img.size
                file_size = os.path.getsize(png_file) / 1024  # Размер в килобайтах

                image_info[png_file] = {'resolution': (width, height), 'file_size_kb': file_size}
        except Exception as e:
            print(f"Ошибка при обработке файла {png_file}: {e}")

    return image_info


def resize_large_png(directory):
    png_files = [file for file in os.listdir(directory) if file.endswith('.png')]

    for png_file in png_files:
        file_path = os.path.join(directory, png_file)
        size_kb = os.path.getsize(file_path) / 1024

        if size_kb > 20:
            image = Image.open(file_path)
            width, height = image.size
            if width > 1280 and height > 640:
                new_width = width // 2
                new_height = height // 2
                resized_image = image.resize((new_width, new_height))
                resized_file_path = os.path.join(directory, png_file)
                resized_image.save(resized_file_path)
                resized_image.close()
                print(f"Resized {png_file} to {new_width}x{new_height}")


def change_color_png(directory):
    png_files = [file for file in os.listdir(directory) if file.endswith('.png')]
    for png_file in png_files:
        file_path = os.path.join(directory, png_file)
        image = Image.open(file_path)
        bw_image = image.convert("L")
        bw_image_path = os.path.join(directory, png_file)
        bw_image.save(bw_image_path)
        bw_image.close()
        print(f"Turn {png_file} to black and white")


directory_path = '.'
image_info = get_image_info(directory_path)

for image_path, info in image_info.items():
    print(f"Изображение: {image_path}")
    print(f"Разрешение: {info['resolution']}")
    print(f"Размер файла: {info['file_size_kb']:.2f} KB")
    print()

resize_large_png(directory_path)
change_color_png(directory_path)
