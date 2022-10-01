package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_04 {
    static int N, M;

    static int solution(int[] arr){
        int start = 0;
        int end = 0;
        int sum = arr[0];
        int count = 0;

        while(start <= end){
            if(sum > M){
                sum -= arr[start++];
            }
            else if(sum < M){
                end++;
                if(end == N){
                    break;
                }
                sum += arr[end];
            }
            else{
                count++;
                sum -= arr[start];
                start++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] input = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(input));
    }
}
