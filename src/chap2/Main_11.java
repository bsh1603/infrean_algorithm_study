package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11 {
    static int N;
    static int[][] map;
    static int[] student;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        map = new int[N + 1][5];
        student = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 0; k < 5; k++) {
                    if(i!=j && map[i][k] == map[j][k]){
                        student[i]++;
                        break;
                    }
                }
            }
        }

        int max = 0;
        for (int i = 1; i < student.length; i++) {
            max = Math.max(max, student[i]);
        }
        for (int i = 1; i < student.length; i++) {
            if(max == student[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
