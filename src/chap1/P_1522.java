/**
 * 길이가 3 이하 -> answer : 0
 * 끝이 a이면 끝 a를 빼고 count  ->  적용 시 틀렸습니다 // 빼고 실행 시 정답
 * 끝이 b이면 그냥 count
 * a의 개수만큼 sliding window로 최소 b 개수 갱신하며 count -> answer
  */

package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1522 {
    static String input;
    static int a_cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        // 원형으로 구성된 수열이므로 슬라이딩 윈도우 사용 시 input의 길이가 넘어가면 다시 앞에도 봐야하므로 두 개를 붙여 새로운 input_new 생성
        String input_new = input + input;

        int answer = 1001;
        int input_len = input.length();

        if(input_len <= 3){
            answer = 0;
        }
        else{
            for (int i = 0; i < input_len; i++) {
                if(input.charAt(i) == 'a'){
                    a_cnt++;
                }
            }

            for (int i = 0; i < input_len; i++) {
                int b_cnt = 0;
                for (int j = i; j < i + a_cnt; j++) {
                    if(input_new.charAt(j) == 'b'){
                        b_cnt++;
                    }
                }

                answer = Math.min(answer, b_cnt);
            }
        }
        System.out.println(answer);
    }
}
