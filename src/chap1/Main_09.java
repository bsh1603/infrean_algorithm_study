package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_09 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        System.out.println(solution(input));
    }

    static int solution(String str){
        String num_line = "";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isAlphabetic(str.charAt(i))){
                num_line += str.charAt(i);
            }
        }
        int answer = Integer.parseInt(num_line);
        return answer;
    }
}
