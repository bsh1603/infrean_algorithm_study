package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_07 {
    static String input;
    static char[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        solution(input);
    }

    static void solution(String str){
        String line = str.toLowerCase();
        list = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            list[i] = line.charAt(i);
        }
        char[] list_reverse = new char[str.length()];
        String line_reverse = "";
        for (int i = 0; i < str.length(); i++) {
            list_reverse[i] = list[str.length()-1-i];
            line_reverse += list_reverse[i];
        }
        if(line.equals(line_reverse)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
