package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_06 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        solution(input);
    }

    static void solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if(!answer.contains(ch)){
                answer += ch;
            }
        }
        System.out.println(answer);
    }
}
