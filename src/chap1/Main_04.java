package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_04 {
    static int N;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            solution(line);
        }
    }

    static void solution(String str){
//        char[] input = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            input[i] = str.charAt(str.length()-1-i);
//        }

//        System.out.println(input);

        sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb);
    }
}
