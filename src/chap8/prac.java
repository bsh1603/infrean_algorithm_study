package chap8;

public class prac {

    public static void main(String[] args) {
        System.out.println(reculsive(1));
    }
    static boolean reculsive(int num){
        if(num==10){
            return true;
        }
        else{
            return reculsive(num+1);
        }
    }
}
