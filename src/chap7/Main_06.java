package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_06 {
    static int N;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        dfs(1);

    }

    static void dfs(int depth){
        if(depth == N + 1){
            String answer = "";
            for (int i = 1; i < N + 1; i++) {
                if(visited[i] == true){
                    answer += (i + " ");
                }
            }
            if(answer.length() > 0){
                System.out.println(answer);
            }
        }
        else{
            visited[depth] = true;
            dfs(depth + 1);
            visited[depth] = false;
            dfs(depth + 1);
        }
    }
}
