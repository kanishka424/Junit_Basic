package main;

public class Main {
    public static void main(String[] args) {
        MyMath myMath=new MyMath();
        int result=myMath.sum(new int[]{1,2,3});
        System.out.println(result);
    }
}
