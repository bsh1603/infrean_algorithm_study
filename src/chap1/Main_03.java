package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_03 {
    static String input;
    static String[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        solution(input);
    }
    
    static void solution(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        list = new String[count+1];
        list = str.split(" ");
        int max = 0;
        String answer = "";
        for (int i = 0; i < list.length; i++) {
            if(list[i].length() > max){
                max = list[i].length();
                answer = list[i];
            }
        }
        System.out.println(answer);
    }
}
