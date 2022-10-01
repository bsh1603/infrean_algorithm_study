package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_02 {
    static int C, N;
    static int[] input;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        dfs(0,0);
        System.out.println(max);
    }

    static void dfs(int depth, int sum){
        if(sum > C){
            return;
        }
        if(depth == N){
            if(sum <= C){
                max = Math.max(max, sum);
            }
        }
        else{
            dfs(depth+1, sum+input[depth]);
            dfs(depth+1, sum);
        }
    }
}
