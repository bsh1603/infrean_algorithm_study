package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13 {
    static int N, M;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + bfs(1, i));
        }

    }

    static int bfs(int start, int end){
        visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        int level = 0;
        queue.add(start);

        while(!queue.isEmpty()){
            int len = queue.size();
            for (int l = 0; l < len; l++) {
                int tmp = queue.poll();
                visited[tmp] = true;
                if(tmp == end){
                    return level;
                }

                for (int i = 0; i < graph.get(tmp).size(); i++) {
                    if(visited[graph.get(tmp).get(i)] == false){
                        queue.offer(graph.get(tmp).get(i));
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
