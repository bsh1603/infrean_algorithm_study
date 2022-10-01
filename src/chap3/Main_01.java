package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_01 {
    static int N, M;
    static int[] arr1, arr2;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        arr2 = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1<N && p2<M){
            if(arr1[p1] <= arr2[p2]){
                answer.add(arr1[p1++]);
            }
            else{
                answer.add(arr2[p2++]);
            }
        }
        while(p1<N){
            answer.add(arr1[p1++]);
        }

        while(p2<M){
            answer.add(arr2[p2++]);
        }

        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}






