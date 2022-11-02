public class getValue {

    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 10, 5, 2, 1};

        System.out.println(maxArrayValue(arr));
        System.out.println(minArrayValue(arr));
    }

    public static int maxArrayValue(int[] arr){

        int temp = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > temp)
                temp = arr[i];
        }

        return temp;
    }  

    public static int minArrayValue(int[] arr){

        int temp = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < temp)
                temp = arr[i];
        }

        return temp;
    }  
}
