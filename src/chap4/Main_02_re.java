package chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_02_re {
    static String str1, str2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
        str2 = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            if(!map.containsKey(str2.charAt(i)) || map.get(str2.charAt(i))==0){
                System.out.println("NO");
                break;
            }
            map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            if(i == str2.length()-1){
                System.out.println("YES");
            }
        }
    }
}
