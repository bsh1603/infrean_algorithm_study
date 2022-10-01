package chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_04 {
    static String S, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        T = br.readLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < T.length(); i++) {
            map2.put(T.charAt(i), map2.getOrDefault(T.charAt(i), 0) + 1);
        }

        for (int i = 0; i < T.length()-1; i++) {
            map1.put(S.charAt(i), map1.getOrDefault(S.charAt(i), 0) + 1);
        }

        int start = 0;
        int count = 0;

        for(int end = T.length()-1; end < S.length(); end++){
            map1.put(S.charAt(end), map1.getOrDefault(S.charAt(end), 0) + 1);
            if(map2.equals(map1)){
                count++;
            }
            map1.put(S.charAt(start), map1.get(S.charAt(start)) - 1);
            if(map1.get(S.charAt(start)) == 0){
                map1.remove(S.charAt(start));
            }
            start++;
        }

        System.out.println(count);
    }
}
