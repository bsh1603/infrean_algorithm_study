package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_01 {
    static int N;
    static int[] num_arr;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num_arr = new int[N + 1];
        num_arr[0] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        answer = new ArrayList<>();

        for (int i = 1; i < num_arr.length; i++) {
            num_arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < num_arr.length - 1; i++) {
            if(num_arr[i] < num_arr[i+1]){
                answer.add(num_arr[i+1]);
            }
        }

        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}
