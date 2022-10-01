package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_06 {
    static int N, K;
    static int[] original;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        original = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int rt = 0;
        int length = 0;
        int cnt = 0;
        int max = 0;

        for (rt = 0; rt < N; rt++) {
            if(original[rt] == 0){
                cnt++;

                while(cnt > K){
                    if(original[lt] == 0){
                        cnt--;
                    }
                    lt++;
                }
            }
            length = rt - lt + 1;
            max = Math.max(max, length);
        }

        System.out.println(max);
    }
}


















