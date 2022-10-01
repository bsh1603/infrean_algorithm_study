package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_04 {
    static int n;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        fibo(n);
    }

    static void fibo(int num){
        for (int i = 2; i < num; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}
