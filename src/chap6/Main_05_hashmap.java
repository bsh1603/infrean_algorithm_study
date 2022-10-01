package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_05_hashmap {
    static int N;
    static int[] number;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            map.put(number[i], map.getOrDefault(number[i], 0) + 1);
        }
//        for (int i = 0; i < map.size(); i++) {
//            if(map.get(number[i]) > 1){
//                System.out.println("D");
//                break;
//            }
//            if(i == map.size()-1){
//                System.out.println("U");
//            }
//        }
        System.out.println(solution());
    }

    static String solution(){
        String answer = "U";
        for (int i = 0; i < map.size(); i++) {
            if(map.get(number[i]) > 1){
                answer = "D";
                break;
            }
        }
        return answer;
    }
}
