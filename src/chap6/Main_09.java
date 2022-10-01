package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_09 {
    static int N, M;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int sum_all = 0;
        int max = 0;
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            sum_all += input[i];
            if(input[i] > max){
                max = input[i];
            }
        }

        int lt = max;
        int rt = sum_all;
        int answer = 0;

        while(lt <= rt){
            int mid = (lt+rt) / 2;
            if(count(input, mid)){
                answer = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }
        System.out.println(answer);

    }

    static boolean count(int[] input, int mid_num){
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < input.length; i++) {
            if((sum + input[i]) <= mid_num){
                sum += input[i];
            }
            else{
                cnt++;
                sum = input[i];
            }
        }
        if(cnt <= M){
            return true;
        }
        else{
            return false;
        }
    }
}














