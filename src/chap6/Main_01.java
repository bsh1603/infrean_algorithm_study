package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_01 {
    static int N;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < input.length-1; i++) {
            int min = input[i];
            for (int j = i+1; j < input.length; j++) {
                if(input[j] < min){
                    min = input[j];
                    input[j] = input[i];
                    input[i] = min;
                }
            }
        }

        for(int val : input){
            System.out.print(val + " ");
        }
    }

}
