package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_07 {
    static String need, subject;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        need = br.readLine();
        subject = br.readLine();
        
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < need.length(); i++) {
            queue.offer(need.charAt(i));
        }

        for (int i = 0; i < subject.length(); i++) {
            if(queue.peek() == subject.charAt(i)){
                queue.poll();
            }
            if(queue.isEmpty()){
                break;
            }
        }
        if(queue.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
