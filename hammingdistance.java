class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x^y;
        while(xor>0){
         int bits = xor&1;
         if(bits==1){
            count++;
         }
         xor = xor>>1;

        }
 
        return count;
    }
}
