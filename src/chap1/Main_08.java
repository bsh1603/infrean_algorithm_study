package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_08 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        solution(input);
    }

    static void solution(String str){
        String line = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                line += str.charAt(i);
            }
        }
        line = line.toLowerCase();

        int left = 0;
        int right = line.length() - 1;
        String line_reverse = "";
        for (int i = 0; i < line.length(); i++) {
            line_reverse += line.charAt(line.length()-1-i);
        }
        if(line.equals(line_reverse)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
