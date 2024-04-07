package BaseballGame;
import java.util.Stack;
public class BaseballGame {

    public static void main(String[] args) {
        String[] test = {"5","2","C","D","+"};
        assert calPoints(test)==30;
        System.out.println("working");
    }

    public static int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> st = new Stack<>();
        for(String operation : operations){
            switch (operation) {
                case "+" -> {
                    int temp = st.pop();
                    score = temp + st.peek();
                    st.push(temp);
                    st.push(score);
                }
                case "D" -> {
                    score = st.peek() * 2;
                    st.push(score);
                }
                case "C" -> st.pop();
                default -> st.push(Integer.valueOf(operation));
            }
        }
        score = 0;
        while(!st.empty()){
            score+=st.pop();
        }
        return score;
    }
}
