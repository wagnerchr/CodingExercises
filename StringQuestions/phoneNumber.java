package StringQuestions;

public class phoneNumber {
    public static void main(String[] args) {
      
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(number));
        System.out.println(createPhoneNumber2(number));
        
    }
    
    
    public static String createPhoneNumber(int[] numbers) {
      
        if(numbers.length != 10)
            return "Sorry, it needs to be an array with 10 integers(0 - 9)";
      
        String fullNumber =  "";
     
        for(int p : numbers) 
            fullNumber += p;
      
        String ddi = fullNumber.substring(0, 3);
        String phoneNumber = fullNumber.substring(3);
        
        return("(" + ddi + ") " + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3));
    }

    // Saw this, best practice
    public static String createPhoneNumber2(int[] numbers) {

        String phoneNumber = new String("(xxx) xxx-xxxx");
        
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        
        return phoneNumber;
    }
}