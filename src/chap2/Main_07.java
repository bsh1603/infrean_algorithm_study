package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_07 {
    static int N;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(input));
    }

    static int solution(int[] arr){
        int score = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                score = 0;
            }
            else{
                score++;
                total += score;
            }
        }
        return total;
    }
}
