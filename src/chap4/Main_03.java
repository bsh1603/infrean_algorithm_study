package chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_03 {
    static int N, K;
    static int[] input;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < K; i++) {
            map.put(input[i], map.getOrDefault(input[i], 0)+1);
        }

        answer = new ArrayList<>();
        answer.add(map.size());

        int start = 0;
        int end = K - 1;

        while(end < N){
            map.put(input[start], map.get(input[start])-1);
            if(map.get(input[start]) == 0){
                map.remove(input[start]);
            }
            start++;
            end++;
            if(end==N){
                break;
            }
            map.put(input[end], map.getOrDefault(input[end], 0) +1);

            answer.add(map.size());
        }

        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}
















