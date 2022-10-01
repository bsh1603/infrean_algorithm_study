package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_07 {
    static int n, r;
    static int sum = 0;
    static int[][] visited = new int[35][35];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        System.out.println(combination(n, r));
    }

    static int combination(int a, int b){
        if(visited[a][b] > 0){
            return visited[a][b];
        }
        if(a == b){
            return 1;
        }
        else if(b == 1){
            return a;
        }
        else{
           return visited[a][b] = combination(a-1, b-1) + combination(a-1, b);
        }
    }
}
