package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_01 {
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==')'){
                if(stack.isEmpty()){
                    System.out.println("NO");
                    break;
                }
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }

            if(i == str.length() - 1){
                System.out.println("YES");
            }
        }
    }
}
