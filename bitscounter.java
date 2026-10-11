package com.vikash;

public class BitsCounter {
    public static void main(String[] args) {
        System.out.println(bitscounter(12));
    }
    public  static int bitscounter(int n){
        int count = 0;
//        while(n>0){
//            count++;
//            n = n-(n&-n);
//        }

        while(n>0){
            count++;
            n = n  & (n-1);
        }
        return count;
    }
}
