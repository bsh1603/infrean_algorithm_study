package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_08 {
    static int N;
    static int[] score;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        ranking(score);

    }

    static void ranking(int[] arr){
        answer = new int[N];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}
