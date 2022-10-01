package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_01 {
    static int N;
    static int[] input;
    static int all;
    static String answer = "NO";
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            all += input[i];
        }
        dfs(0,0);
        System.out.println(answer);
    }

    static void dfs(int depth, int sum){
        if(flag) return;
        if(sum > (all / 2)){
            return;
        }
        if(depth==N){
            if((all - sum) == sum){
                answer = "YES";
                flag = true;
            }
        }

        else{
            dfs(depth+1, sum+input[depth]);
            dfs(depth+1, sum);
        }
    }
}
