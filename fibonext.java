class Solution {
    static int fibo(int n) {
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public int fib(int n){
        return fibo(n);
    }
}
 explain this step by step in this explain this part     public int fib(int n){
        return fibo(n);
    } 
