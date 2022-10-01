package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_03 {
    static int N, M;
    static Problem[] input;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new Problem[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            input[i] = new Problem(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        dfs(0,0,0);
        System.out.println(max);
    }

    static void dfs(int depth, int score_sum, int time_sum){
        if(time_sum > M){
            return;
        }
        if(depth == N){
            max = Math.max(max, score_sum);
        }
        else{
            dfs(depth+1, score_sum + input[depth].score, time_sum + input[depth].time);
            dfs(depth+1, score_sum, time_sum);
        }

    }

    static class Problem{
        int score;
        int time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }
}
