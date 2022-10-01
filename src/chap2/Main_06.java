package chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_06 {
    static int N;
    static String[] input;
    static ArrayList<Integer> list;
    static ArrayList<Integer> answer;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        input = new String[N];
        list = new ArrayList<>();
        answer = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            input[i] = st.nextToken();
            String reverse = "";
            for (int j = 0; j < input[i].length(); j++) {
                reverse += input[i].charAt(input[i].length()-1-j);
            }
            list.add(Integer.parseInt(reverse));
        }
        prime(list);
    }
    
    static void prime(ArrayList<Integer> arr){
        visited[0] = true;
        visited[1] = true;

        for (int i = 2; i < visited.length; i++) {
            if(visited[i] == false){
                for (int j = i*2; j < visited.length; j+=i) {
                    visited[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if(visited[arr.get(i)] == false){
                answer.add(arr.get(i));
            }
        }
        for(int val : answer){
            System.out.print(val + " ");
        }
    }
}
