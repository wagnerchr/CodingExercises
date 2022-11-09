import java.util.Arrays;
import java.util.List;

class zprova3 {
    public static void main(String[] args) {
        
        System.out.println(
        calculaNumeroDaSenha(Arrays.asList("0110100000","1001011111","1110001010","0111010101","0011100110","1010011001","1101100100","1011010100","1001100111","1000011000")));
    }
  
    public static Integer calculaNumeroDaSenha(List<String> senha) {
         
        String senhaCript = "";
        for(int i = 0; i < senha.get(0).length(); i++) {
            Integer countZero = 0;
            Integer countOne = 0;       
            for(int j = 0; j < senha.size(); j++) {
                senha.get(j);
                if(senha.get(j).charAt(i) == '0')
                    countZero++;
                else
                    countOne++;
            }
            senhaCript += countZero > countOne
                ? "0"
                : "1";
        }
        return getDecimalValue(senhaCript);
    }

    public static Integer getDecimalValue(String binary) {

      int binaryCount = 1;
      Integer number = 0;
    for(int i = (binary.length() -1); i >= 0; i--) {  
        if(binary.charAt(i) == '1') 
            number += binaryCount;
       
        binaryCount += binaryCount;
    }
    
    return number;
    }   
}