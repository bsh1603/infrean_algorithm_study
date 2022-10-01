package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_05 {
    static int N;

    static int solution(int n){
        int arr[] = new int[n/2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        int lt = 0;
        int rt = 0;
        int sum = arr[rt];
        int count = 0;
        while(lt <= rt){
            if(sum < N){
                rt++;
                if(rt == arr.length){
                    break;
                }
                sum += arr[rt];
            }
            else if(sum > N){
                sum -= arr[lt];
                lt++;
            }
            else{
                count++;
                sum -= arr[lt];
                lt++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }
}
