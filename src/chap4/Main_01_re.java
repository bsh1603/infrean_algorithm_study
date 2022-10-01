package chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_01_re {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] vote = new int[26];
        String input = br.readLine();

        for (int i = 0; i < N; i++) {
            vote[input.charAt(i) - 'A']++;
        }

        int max = 0;
        for (int i = 0; i < vote.length; i++) {
            max = Math.max(max, vote[i]);
        }

        for (int i = 0; i < vote.length; i++) {
            if(max == vote[i]){
                System.out.println((char)(i+65));
            }
        }
    }
}
