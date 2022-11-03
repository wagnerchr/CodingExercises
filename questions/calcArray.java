package questions;

public class calcArray {
    public static void main(String[] args) {
        
        int[] arr = {10, 8};

        System.out.println("Average is: " + getAverage (arr));

    }

    // Get calc Array average
    public static float getAverage(int[] arr) {
        
        int sum = 0;

        for(int a : arr) {
            sum = sum + a;   
        }

        float average = (sum / arr.length);  
        return average;
    }   

    //
}
