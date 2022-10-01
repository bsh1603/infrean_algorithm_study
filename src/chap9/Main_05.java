package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_05 {
    static int N, M;
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
        }
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0));

        while(!pq.isEmpty()){
            Node tmp = pq.poll();
            if(tmp.cost > dist[tmp.end]){
                continue;
            }
            for (int i = 0; i < graph.get(tmp.end).size(); i++) {
                Node nextNode = graph.get(tmp.end).get(i);
                if(dist[nextNode.end] > nextNode.cost + dist[tmp.end]){
                    dist[nextNode.end] = nextNode.cost + dist[tmp.end];
                    pq.offer(nextNode);
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if(dist[i] < Integer.MAX_VALUE){
                System.out.printf("%d : %d", i, dist[i]);
            }
            else{
                System.out.printf("%d : impossible", i);
            }
            System.out.println("");
        }
    }

    static class Node implements Comparable<Node>{
        int end;
        int cost;

        public Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
