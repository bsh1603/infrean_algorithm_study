package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12 {
    static int T;
    static String input;
    static String[] input_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        input = br.readLine();
        input_arr = new String[T];
        String answer = "";
        for (int i = 0; i < T; i++) {
            input_arr[i] = input.substring(7 * i, 7 *(i+1)).replace('#', '1').replace('*','0');
            answer += (char)Integer.parseInt(input_arr[i],2);
        }
        System.out.println(answer);
    }
}
