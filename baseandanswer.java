package com.vikash;

public class powerofthree {
    public static void main(String[] args) {
        int base = 2;
        int n = 8;
        int ans = 1;
        while(n>0){
            int bits = n&1;
            n = n>>1;
            if(bits==1) {
                base = base * base;
                ans = ans * base;
            }
        }
        System.out.println(ans);
    }
}
