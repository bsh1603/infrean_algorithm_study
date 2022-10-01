package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_08_retry {
    static int N, M;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            queue.offer(new Person(i, input[i]));
        }


        int cnt = 0;
        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for (Person x : queue) {
                if(tmp.danger < x.danger){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                cnt++;
                if(tmp.id == M){
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }

    static class Person{
        int id;
        int danger;

        public Person(int id, int danger) {
            this.id = id;
            this.danger = danger;
        }
    }
}

















