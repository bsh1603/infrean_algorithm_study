package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_05 {
    static int N;
    static int[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);
        int lt = 0;
        int rt = 1;

        while(rt < number.length){
            if(number[lt] == number[rt]){
                System.out.println("D");
                break;
            }
            else{
                lt++;
                rt++;
            }

            if(rt == number.length -1){
                System.out.println("U");
            }
        }
    }
}
