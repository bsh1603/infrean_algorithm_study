package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_03 {
    static int N;
    static int[][] board;
    static int M;
    static int[] moves;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        board = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }

        M = Integer.parseInt(br.readLine());
        moves = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken()) - 1;
        }

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < moves.length; i++) {
            int n = 0;
            while(n<N){
                if(visited[n][moves[i]] == true){
                    n++;
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(board[n][moves[i]]);
                        visited[n][moves[i]] = true;
                        break;
                    }
                    if(stack.peek() == board[n][moves[i]]){
                        stack.pop();
                        visited[n][moves[i]] = true;
                        cnt++;
                        break;
                    }
                    else{
                        stack.push(board[n][moves[i]]);
                        visited[n][moves[i]] = true;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt * 2);

    }
}
