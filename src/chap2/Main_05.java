package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_05 {
    static int N;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        visited[0] = true;
        visited[1] = true;
        for (int i = 2; i <= N; i++) {
            if(visited[i] == false){
                for (int j = i * 2; j <= N; j+=i) {
                    visited[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < visited.length; i++){
            if(visited[i] == false){
                count++;
            }
        }
        System.out.println(count);
    }
}
