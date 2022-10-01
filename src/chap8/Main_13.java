package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13 {
    static int[] mx = {-1,1,0,0,-1,-1,1,1};
    static int[] my = {0,0,-1,1,-1,1,-1,1};
    static int N;
    static int[][] map;

    static void bfs(Queue<Point> q){
        while(!q.isEmpty()){
            Point p = q.poll();

            for (int i = 0; i < 8; i++) {
                int y = p.y + my[i];
                int x = p.x + mx[i];

                if(0<=y && y<N && 0<=x && x<N){
                    if(map[y][x] == 1){
                        map[y][x] = 0;
                        q.offer(new Point(y, x, map[y][x]));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<Point> queue = new LinkedList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1){
                    queue.offer(new Point(i, j, map[i][j]));
                    bfs(queue);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static class Point{
        int y;
        int x;
        int type;

        public Point(int y, int x, int type) {
            this.y = y;
            this.x = x;
            this.type = type;
        }
    }
}
