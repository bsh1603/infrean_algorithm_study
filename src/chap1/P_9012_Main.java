package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P_9012_Main {
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        String input = br.readLine();
        Queue<Character> queue = new LinkedList<>();
        int left_cnt = 1;
        int right_cnt = 0;
        boolean flag = false;

        if(input.charAt(0) == ')'){
            System.out.println("NO");
        }
        else{
            queue.offer(input.charAt(0));
            while(!queue.isEmpty()){
                if(left_cnt + right_cnt == input.length()){
                    if(left_cnt == right_cnt){
                        flag = true;
                    }
                    break;
                }
                for (int i = 1; i < input.length(); i++) {
                    if(input.charAt(i) == '('){
                        queue.offer(input.charAt(i));
                        left_cnt++;
                    }
                    else{
                        queue.poll();
                        right_cnt++;
                    }
                }

            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
