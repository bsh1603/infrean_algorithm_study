package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_08 {
    static int N, F;
    static boolean[] visited;
    static int[] arr;
    static int[] multiply;
    static int[][] comb = new int[15][15];
    static boolean flag = false;

    static int combination(int n, int r){
        if(comb[n][r] > 0){
            return comb[n][r];
        }
        if((n==r) || (r==0)){
            return 1;
        }
        else{
            return comb[n][r] = combination(n-1, r-1) + combination(n-1, r);
        }
    }

    static void dfs(int depth, int sum){
        if(flag){
            return;
        }

        if(depth == N){
            if(sum == F){
                for(int val : arr){
                    System.out.print(val + " ");
                    flag = true;
                }
            }
        }
        else{
            for (int i = 1; i <= N; i++) {
                if(visited[i] == false){
                    visited[i] = true;
                    arr[depth] = i;
                    dfs(depth+1, sum + (arr[depth] * multiply[depth]));
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[N];
        multiply = new int[N];
        for (int i = 0; i < N; i++) {
            multiply[i] = combination(N-1, i);
        }

        dfs(0,0);
    }
}
