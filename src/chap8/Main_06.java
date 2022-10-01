package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_06 {
    static int N, M;
    static int[] input;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        input = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
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
            for (int i = 0; i < N; i++) {
                if(visited[i] == false) {
                    visited[i] = true;
                    answer[depth] = input[i];
                    dfs(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
