package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_04 {
    static int N;
    static ArrayList<Lecture> lectures;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        lectures = new ArrayList<>();
        StringTokenizer st;
        int max_day = 0;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int money = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            lectures.add(new Lecture(money, time));
            if(max_day < time){
                max_day = time;
            }
        }
        Collections.sort(lectures);
        int n = 0;

        for (int i = max_day; i >= 1; i--) {
            for (int j = n; j < N; j++) {
                if(lectures.get(j).time < i){
                    break;
                }
                pq.offer(lectures.get(j).money);
                n++;
            }
            if(!pq.isEmpty()){
                answer += pq.poll();
            }
        }
        System.out.println(answer);
    }

    static class Lecture implements Comparable<Lecture>{
        int money;
        int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            if(o.time == this.time){
                return o.money - this.money;
            }
            else {
                return o.time - this.time;
            }
        }
    }
}
