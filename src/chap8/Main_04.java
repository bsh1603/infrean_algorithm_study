package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_04 {
    static int N, M;
    static int[] arr;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        answer = new int[M];
        dfs(0);
    }

    static void dfs(int depth){
        if(depth == M){
            for(int val : answer){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
        else{
            for (int i = 1; i <= N; i++) {
                answer[depth] = i;
                dfs(depth+1);
            }
        }
    }
}
