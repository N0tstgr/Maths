package RecursionPractice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(rotatearray(arr,k)));

    }
    public static int[] rotatearray(int[] arr, int k){
        int[] result = new int[arr.length];
        int j = 0;
        for(int i = arr.length-k; i<arr.length; i++){
            result[j] = arr[i];
            j++;
        }

        for(int i = 0; i<=k; i++){
            result[j] = arr[i];
            j++;
        }
        return result;

    }

}
