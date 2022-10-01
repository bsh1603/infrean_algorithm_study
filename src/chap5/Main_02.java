package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_02 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ')'){
                while(true){
                    if(stack.pop() == '('){
                        break;
                    }
                }
            }
            else{
                stack.push(input.charAt(i));
            }
        }
        String answer = "";

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        System.out.println(answer);
    }
}
