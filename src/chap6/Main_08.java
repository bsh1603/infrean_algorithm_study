package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_08 {
    static int N, M;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        int s = 0;
        int e = input.length - 1;

        while(s <= e){
            int mid = (s+e) / 2;
            if(input[mid] > M){
                e = mid;
            }
            else if(input[mid] < M){
                s = mid;
            }
            else{
                System.out.println(mid + 1);
                break;
            }
        }
    }
}
