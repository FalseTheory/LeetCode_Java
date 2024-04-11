package setMatrixZeros;

import java.util.HashSet;

public class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        HashSet<Integer> columns = new HashSet<>();
        boolean rowHasZero = false;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    columns.add(j);
                    rowHasZero = true;
                }
            }
            if(rowHasZero){
                setRows(matrix,i);
                rowHasZero = false;
            }
        }
        for(Integer col : columns){
            setColumns(matrix,col);
        }


    }
    public void setRows(int[][] matrix, int rInd){
        for(int j = 0; j<matrix[rInd].length;j++){
            matrix[rInd][j] = 0;
        }
    }
    public void setColumns(int[][] matrix,int cInd){
        for(int i = 0; i<matrix.length;i++){
            matrix[i][cInd] = 0;
        }

    }
}
