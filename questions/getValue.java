package questions;

public class getValue {

    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 10, 0, 2, 1, 6, 7, 2};

        System.out.println("Max value: " + ArrayValue(arr, "max"));
        System.out.println("Min value: " + ArrayValue(arr,  "min"));
        System.out.println(arrayValue(arr, 10 - 5));
        System.out.println("Index is: " + findArrayIndex(arr, 2));

        System.out.println(arr.length);

        String phoneNumber = "";
        String ddi = "";

        for(int p : arr) 
            phoneNumber += p;

        ddi = phoneNumber.substring(0, 3);
       
        System.out.println("(" + ddi + ")" +phoneNumber.substring(3));
        System.out.println(ddi);
    }

    // If array has determinated value
    public static boolean arrayValue(int[] arr, int value) {
        for(int a : arr) {
            if(a == value)
                return true;
        }
        return false;
    } 

    // Find array value index
    public static int findArrayIndex(int[] arr, int value) {
        for(int a = 0; a <arr.length; a++) {
            if(arr[a] == value) 
                return a;
        }
        return 0;
    }

// Get max/min Array value:
    public static int ArrayValue(int[] arr, String m){
        // Max Value
        if(m.toLowerCase() == "max") {

            int temp = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > temp)
                    temp = arr[i];
            }
            return temp;

        // Min Value
        } else if(m.toLowerCase() == "min") {

            int temp = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < temp)
                    temp = arr[i];
            }
            return temp;

        // Holding wrong m parameter
        } else {
            System.out.println("Sorry, didn't undertand. Please enter with \"max\" or \"min\" ");
            return 0;
        }     
    }  
    //

    // Get first and last
    
}
