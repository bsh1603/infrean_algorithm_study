package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_03 {
    static int N, K;

    static int solution(int[] arr){
        int start = 0;
        int end = K;
//        while (end < N){
//            int sum = 0;
//            for (int i = start; i < end; i++) {
//                sum += arr[i];
//            }
//            start++;
//            end++;
//            max = Math.max(max, sum);
//        }
        int sum = 0;
        for (int i = 0; i < end; i++) {
            sum += arr[i];
        }
        int max = sum;

        while(end < N){
            sum = sum - arr[start] + arr[end];
            end++;
            start++;
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] input = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(input));
    }
}
