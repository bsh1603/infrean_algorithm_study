package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_03 {
    static int N;
    static int[] A;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        rsp(N, A, B);
    }

    static void rsp(int num, int[] arr1, int[] arr2){
        // 1. 비기는 경우 -> D, arr1[i] == arr2[i]
        for (int i = 0; i < num; i++) {
            if(arr1[i] == arr2[i]){
                System.out.println("D");
            }
            else if((arr1[i]==1 && arr2[i]==3) || (arr1[i]==2 && arr2[i]==1) || (arr1[i]==3 && arr2[i]==2)){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
