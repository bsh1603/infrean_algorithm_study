package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_02 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        reculsive(N);
    }

    static void reculsive(int N){
        if(N < 1){
            return;
        }
        reculsive(N / 2);
        System.out.print(N%2);
    }
}
