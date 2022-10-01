package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_06 {
    static int N;
    static int[] height;
    static int[] real;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        height = new int[N];
        real = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }
        real = Arrays.copyOf(height, height.length);
        Arrays.sort(real);

        for (int i = 0; i < N; i++) {
            if(height[i] != real[i]){
                list.add(i + 1);
            }
        }
        for(int val : list){
            System.out.print(val + " ");
        }
    }
}
