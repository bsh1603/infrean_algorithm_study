package chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_05_TreeSet {
    static int N, K;
    static int[] input;
    static ArrayList<Integer> sum_arr;

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
        sum_arr = new ArrayList<>();

        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = 0;
                    sum += input[i] + input[j] + input[k];
                    sum_arr.add(sum);
                }
            }
        }

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < sum_arr.size(); i++) {
            set.add(sum_arr.get(i));
        }

        int cnt = 0;
        for(int answer : set){
            cnt++;
            if(cnt == K){
                System.out.println(answer);
            }
        }
        if(set.size() < K){
            System.out.println("-1");
        }
    }
}
