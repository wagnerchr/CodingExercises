class sortArray {

    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 5};
        String[] arr2 = {"k", "z", "c", "j"};
        
        for(int i : sortInteger(arr)) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----- ");

        for(String i : sortString(arr2)) {
            System.out.print(i + " ");
        }
    }
    
    // Sorting Int
    public static int[] sortInteger(int[] arr) {

        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Sorting String
    public static String[] sortString(String[] arr) {

        String temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}