package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_02 {
    static int N;
    static int[] student;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        student = new int[N];
        for (int i = 0; i < N; i++) {
            student[i] = Integer.parseInt(st.nextToken());
        }

        int max = student[0];
        int count = 1;
        for (int i = 0; i < student.length; i++) {
            if(student[i] > max){
                max = student[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
