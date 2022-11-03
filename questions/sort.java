package questions;

public class sort {

    public static void main(String[] args) {
        
        String[] arr = {"a", "b", "d", "z", "g"};

        for(String a : sortArray(arr)) {
            System.out.println(a);
        };
       
    }

    // Sort Array
    public static String[] sortArray(String[] arr) {
        
        String temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;  
    }
 
    
}
