class Solution {
    public boolean hasAlternatingBits(int n) {

        while(n>0){
         int bits = n&1;
        n = n>>1;
         int bits1 = n&1;
        if(bits==bits1 && n>0){
            return false;
        }
        }

        return true;

    }
}
