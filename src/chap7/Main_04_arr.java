package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_04_arr {
    static int N;
    static int[] fibo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibo = new int[N + 1];
        fibonacci(N);
        for (int i = 1; i <= N; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    static int fibonacci(int n){
        if(fibo[n] > 0){
            return fibo[n];
        }
        if(n==1){
            return fibo[n] = 1;
        }
        else if(n ==2){
            return fibo[n] = 1;
        }
        else{
            return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
