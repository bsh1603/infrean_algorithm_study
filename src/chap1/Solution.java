/**
 * dfs
 * 길이 >= course[i]인 경우
 */

package chap1;

import java.util.HashMap;

class Solution {
    static HashMap<String, Integer> map = new HashMap<>();
    static boolean[] visited = new boolean[26];
    static String new_str = "";

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }

    static int combination(int n, int r){
        int[][] comb = new int[11][11];
        if(comb[n][r] > 0){
            return comb[n][r];
        }
        if(r==0 || n==r){
            return 1;
        }
        return comb[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }

    static void dfs(String str, int depth, int n){

        if(n == depth){
            map.put(new_str, map.getOrDefault(new_str, 0) + 1);
            System.out.println(new_str);
            new_str = "";
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                if(visited[str.charAt(i) - 'A'] == false){
                    visited[str.charAt(i) - 'A'] = true;
                    new_str += str.charAt(i);
                    dfs(str, depth+1, n);
                    visited[str.charAt(i) - 'A'] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        dfs("ABCFG",0, 2);
    }
}
