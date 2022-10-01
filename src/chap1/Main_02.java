package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_02 {
    static String input;
    static char[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        data = new char[input.length()];
        solution(input);
    }

    static void solution(String str){
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) >= 'a'){
//                data[i] = Character.toUpperCase(str.charAt(i));
//            }
//            else{
//                data[i] = Character.toLowerCase(str.charAt(i));
//            }
//        }
//        System.out.println(data);

        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }
            else{
                answer += Character.toLowerCase(x);
            }
        }
        System.out.println(answer);

    }
}
