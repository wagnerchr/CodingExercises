package questions;

import java.util.Arrays;

public class modifyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 3};

        System.out.println(Arrays.toString(removeValue(arr, 3)));
    }

    // Remove all value from Array
    public static int[] removeValue(int[] arr, int value) {
        
        int p = 0;
        for(int a = 0; a < arr.length; a++) {
            if(arr[a] == value)
                p++;
        }

        int[] newArray = new int[arr.length - p];

        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] != value) {
                newArray[j] = arr[i];
                j++;
            }      
        }
          
        return newArray;
    }
}
