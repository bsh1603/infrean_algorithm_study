package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_02 {
    static int N;
    static Time[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new Time[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            input[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(input);
        int cnt = 1;
        int time = input[0].end;

        for (int i = 1; i < N; i++) {
            if(input[i].start == time){
                cnt++;
                time = input[i].end;
            }
        }
        System.out.println(cnt);

    }

    static class Time implements Comparable<Time>{
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if(this.end==o.end){
                return this.start - o.start;
            }
            return this.end - o.end;
        }
    }
}
