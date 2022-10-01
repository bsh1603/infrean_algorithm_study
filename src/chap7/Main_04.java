package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_04 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
