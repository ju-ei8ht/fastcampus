package javajungsuk.ch06.박주영;

import java.util.Arrays;

public class Exercise6_23 {
    static int max(int[] arr){
        if(arr == null || arr.length == 0) return -999999;

        int result = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > result) result = arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
}
