package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_12 {
    static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        visited = new boolean[N + 1];
        System.out.println(dfs(1,5));

    }

    static int dfs(int start, int end){
        visited[start] = true;
        for (int i = 0; i < graph[start].size(); i++) {
            if(graph[start].get(i) == end){
                cnt++;
            }
            else if(visited[graph[start].get(i)] == false){
                dfs(graph[start].get(i) , end);
            }
        }
        visited[start] = false;

        return cnt;
    }
}
