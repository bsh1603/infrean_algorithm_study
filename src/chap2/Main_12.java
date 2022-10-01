package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_12 {
    static int N, M;
    static ArrayList<Integer>[] rank;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        rank = new ArrayList[N+1];

        for (int i = 1; i < N + 1; i++) {
            rank[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(j > i){
                    rank[map[0][i]].add(map[0][j]);
                }
            }
        }
        for (int i = 1; i < M; i++) {
            for (int j = N-1; j >= 0; j--) {
                for (int k = N-1; k >= 0; k--) {
                    if(j > k){
                        rank[map[i][j]].remove(Integer.valueOf(map[i][k]));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(rank));
        int count = 0;
        for (int i = 1; i < rank.length; i++) {
            count += rank[i].size();
        }
        System.out.println(count);

    }
}
