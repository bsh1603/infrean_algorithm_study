package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_06 {
    static int N, K;
    static ArrayList<Integer> prince;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prince = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            prince.add(i+1);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(prince.get(i));
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < K - 1; j++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}














