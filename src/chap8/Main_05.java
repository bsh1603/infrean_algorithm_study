package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_05 {
    static int N;
    static int[] kind;
    static int M;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        kind = new int[N];
        for (int i = 0; i < N; i++) {
            kind[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        dfs(0,0);
        System.out.println(min);
    }

    static void dfs(int depth, int sum){
        if(sum > M){
            return;
        }
        if(sum == M){
            min = Math.min(min, depth);
            return;
        }
        else{
            for (int i = N-1; i >=0; i--) {
                if(min > depth){
                    dfs(depth + 1, sum+kind[i]);
                }
            }
        }
    }
}
