class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int count = 0;
        String binary = "";
        while(n>0){
            int rem = n%2;
            binary = rem + binary;
            n = n/2;
        }
        for(int i = 0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                for(int j = i+1; j<binary.length(); j++ ){
                 
                 if(binary.charAt(j)=='1'){
                    count = j-i;
                    max = Math.max(max,count);
                    break;
                    }
                }
            }
        }
        return max;
    }
}
