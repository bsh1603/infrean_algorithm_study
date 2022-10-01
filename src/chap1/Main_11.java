package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11 {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        input += " ";

        String answer = "";
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }
            else{
                answer += input.charAt(i);
                if(count > 1){
                    answer += count;
                    count = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
