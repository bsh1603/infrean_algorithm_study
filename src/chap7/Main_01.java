package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_01 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        reculsive(N);
    }

    static void reculsive(int n){
        if(n == 0){
            return;
        }
        reculsive(n - 1);
        System.out.print(n + " ");
    }
}
