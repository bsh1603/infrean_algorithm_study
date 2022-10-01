package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_05 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('){
                stack.push(input.charAt(i));
            }
            else{
                stack.pop();
                if(input.charAt(i-1) == '('){
                    count += stack.size();
                }
                else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
