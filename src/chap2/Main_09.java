package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_09 {
    static int N;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max1 = 0;
        for (int i = 0; i < map.length; i++) {
            int sum = 0;
            for (int j = 0; j < map[i].length; j++) {
                sum += map[i][j];
                max1 = Math.max(max1, sum);
            }
        }
        int max2 = 0;
        for (int j = 0; j < map.length; j++) {
            int sum = 0;
            for (int i = 0; i < map.length; i++) {
                sum += map[i][j];
                max2 = Math.max(max2, sum);
            }
        }
        int answer = Math.max(max1, max2);

        int max3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == j) {
                    sum1 += map[i][j];
                } else if (i + j == 4) {
                    sum2 += map[i][j];
                }
            }
        }
        max3 = Math.max(sum1, sum2);
        answer = Math.max(answer, max3);
        System.out.println(answer);

    }
}
