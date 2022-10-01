package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_04 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        Stack<Integer> stack = new Stack<>();
        int lt, rt;
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                stack.push(Character.getNumericValue(input.charAt(i)));
            }
            else{
                lt = stack.pop();
                rt = stack.pop();
                if(input.charAt(i) == '+'){
                    answer = lt + rt;
                    stack.push(answer);
                }
                else if(input.charAt(i) == '-'){
                    answer = rt - lt;
                    stack.push(answer);
                }
                else if(input.charAt(i) == '*'){
                    answer = lt * rt;
                    stack.push(answer);
                }
                else if(input.charAt(i) == '/'){
                    answer = rt / lt;
                    stack.push(answer);
                }
            }
        }
        System.out.println(answer);
    }
}
