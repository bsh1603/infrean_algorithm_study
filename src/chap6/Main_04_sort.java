package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_04_sort {
    static int S, N;
    static int[] cache;
    static int[] input;

    static void miss(int[] cache, int n){
        for (int i = cache.length - 1; i >= 1; i--) {
            cache[i] = cache[i-1];
        }
        cache[0] = n;
    }
    
    static void hit(int[] cache, int n){
        int index = 0;
        for (int i = 0; i < cache.length; i++) {
            if(cache[i] == n){
                index = i;
            }
        }
        for (int i = index-1; i >= 0; i--) {
            int tmp = cache[i];
            cache[i] = cache[i+1];
            cache[i+1] = tmp;
        }
    }
    
    static boolean isExist(int[] cache, int n){
        for (int i = 0; i < cache.length; i++) {
            if(cache[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        S = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        cache = new int[S];

        st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if(isExist(cache, input[i])){
                hit(cache, input[i]);
            }
            else{
                miss(cache, input[i]);
            }
        }

        for(int val : cache){
            System.out.print(val + " ");
        }
    }
}
