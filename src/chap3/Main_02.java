package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_02 {
    static int N, M;
    static ArrayList<Integer> arr1, arr2;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr2 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            arr2.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1<N && p2<M){
            if(arr1.get(p1) < arr2.get(p2)){
                p1++;
            }
            else if(arr1.get(p1) > arr2.get(p2)){
                p2++;
            }
            else{
                answer.add(arr1.get(p1));
                p1++;
                p2++;
            }
        }

        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}











