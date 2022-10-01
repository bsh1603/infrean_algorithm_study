package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_01 {
    static String input;
    static char alphabet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        alphabet = br.readLine().charAt(0);

        System.out.println(solution(input, alphabet));
    }

    static int solution(String str, char c){
        str = input.toLowerCase();
        c = Character.toLowerCase(c);
        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c){
//                count++;
//            }
//        }
        for(char x : str.toCharArray()){
            if(x == c){
                count++;
            }
        }
        return count;
    }
}
