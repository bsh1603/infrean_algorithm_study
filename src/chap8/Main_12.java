package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_12 {
    static int M, N;
    static int[] mx = {-1, 1, 0, 0};
    static int[] my = {0, 0, -1, 1};
    static int[][] map;
    static int[][] count;
    static Queue<Point> queue = new LinkedList<>();
    static boolean possible = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        count = new int[N][M];
        int num_zero = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0){
                    num_zero++;
                }
                else if(map[i][j] == 1){
                    queue.offer(new Point(i, j, map[i][j]));
                    num_zero++;
                }
            }
        }

        int cnt = 0;
        int day = 0;
        while(!queue.isEmpty()){
            Point p = queue.poll();
            cnt++;

            if(num_zero == cnt){
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        day = Math.max(day, count[i][j]);
                    }
                }
                possible = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int y = p.y + my[i];
                int x = p.x + mx[i];

                if(0 <= y && y <= N-1 && 0 <= x && x <= M-1){
                    if(map[y][x] == 0){
                        map[y][x] = 1;
                        count[y][x] = count[p.y][p.x] + 1;
                        queue.offer(new Point(y, x, map[y][x]));
                    }
                }
            }
        }

        if(possible){
            System.out.println(day);
        }
        else{
            System.out.println(-1);
        }
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
