package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10 {
    static int N, C;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        int lt = 1;
        int rt = input[input.length - 1];
        int answer = 0;

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(input, mid) >= C){
                answer = mid;
                lt = mid + 1;
            }
            else{
                rt = mid - 1;
            }
        }
        System.out.println(answer);

    }

    static int count(int[] arr, int n){
        int cnt = 1;
        int ep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] - ep) >= n){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
