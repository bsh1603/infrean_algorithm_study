package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_05 {
    static String input;
    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        solution(input);

    }

    static void solution(String str){
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
//            if((arr[right]>=65 && arr[right]<=79) && ((arr[left] - 'a'>=0 && arr[left] - 'a'<=26)||(arr[left] - 'A'>=0 && arr[left] - 'A'<=26))){
//                right--;
//            }
//            else if((arr[left]>=65 && arr[left]<=79) && ((arr[right] - 'a'>=0 && arr[right] - 'a'<=26)||(arr[right]-'A'>=0 && arr[right]-'A'<=26))){
//                left++;
//            }
            if(!Character.isAlphabetic(arr[left])){
                left++;
            }
            else if(!Character.isAlphabetic(arr[right])){
                right--;
            }
            else{
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
                left++;
                right--;
            }

        }
        System.out.println(arr);
    }
}
//if(((arr[left] - 'a'>=0 && arr[left] - 'a'<=26)||(arr[left] - 'A'>=0 && arr[left] - 'A'<=26))
//        && ((arr[right] - 'a'>=0 && arr[right] - 'a'<=26)||(arr[right]-'A'>=0 && arr[right]-'A'<=26)))
