package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_05_math {

    static int solution(int n){
        int count = 0;
        int num = 1;
        n--;

        while(n>0){
            num++;
            n -= num;
            if(n % num == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }
}
