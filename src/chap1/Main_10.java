package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10 {
    static String s;
    static char t;
    static char[] input;
    static int[] arr;
    static ArrayList<Integer> tmp;
    static StringBuilder sb;

    static void solution(String str, char c){
        input = new char[str.length()];
        arr = new int[str.length()];
        Arrays.fill(arr, 100);

        for (int i = 0; i < input.length; i++) {
            input[i] = str.charAt(i);
        }
        tmp = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == c) {
                arr[i] = 0;
                tmp.add(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < tmp.size(); j++) {
                arr[i] = Math.min(Math.abs(i - tmp.get(j)), arr[i]);
            }
        }

        sb = new StringBuilder();
        for(int val : arr){
            sb.append(val);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        s = st.nextToken();
        t = st.nextToken().charAt(0);
        solution(s, t);
//        input = new char[s.length()];

//        arr = new int[s.length()];
//        Arrays.fill(arr, 100);
//
//        for (int i = 0; i < input.length; i++) {
//            input[i] = s.charAt(i);
//        }
//        int p = 0;
//        tmp = new ArrayList<>();
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == t) {
//                arr[i] = p;
//                tmp.add(i);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < tmp.size(); j++) {
//                arr[i] = Math.min(Math.abs(i - tmp.get(j)), arr[i]);
//            }
//        }
//
//        sb = new StringBuilder();
//        for(int val : arr){
//            sb.append(val);
//            sb.append(" ");
//        }
//        System.out.println(sb);
    }
}
