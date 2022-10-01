package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_08 {
    static int S, E;
    static ArrayList<Integer>[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        map = new ArrayList[10001];
        visited = new boolean[10001];

        for (int i = 0; i < map.length; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 1; i < map.length; i++) {
            map[i].add(i - 1);
            map[i].add(i + 1);
            map[i].add(i + 5);
        }

        bfs();
    }

    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);
        int level = 0;
        while(!queue.isEmpty()){
            int len = queue.size();

            for (int j = 0; j < len; j++) {
                int tmp = queue.poll();
                if(tmp == E){
                    System.out.println(level);
                    queue.clear();
                    break;
                }
                for (int i = 0; i <= 2; i++) {
                    if(map[tmp].get(i) >= 1 && map[tmp].get(i) <= 10000 && visited[map[tmp].get(i)] == false){
                        queue.offer(map[tmp].get(i));
                        visited[map[tmp].get(i)] = true;
                    }
                }
            }
            level++;
        }
    }
}
