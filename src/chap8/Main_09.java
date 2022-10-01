package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_09 {
    static int N, M;
    static int[] answer;
    static boolean[] visited;

    static void dfs(int depth, int num){
        if(depth == M){
            for(int val : answer){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
        else{
            for (int i = num; i <= N; i++) {
                answer[depth] = i;
                dfs(depth+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[M];
        visited = new boolean[N+1];
        dfs(0, 1);
    }
}
