import java.util.Arrays;
import java.util.List;

class zprova2 {
    public static void main(String[] args) {
        
        System.out.println(retornaMenorEMaiorValorDeVendas(Arrays.asList(Arrays.asList(200,100),Arrays.asList(300))));
    }

    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
      
        Integer minValue = tickets.get(0).get(0);
        Integer maxValue = tickets.get(0).get(0);
        
        for(List<Integer> innerList : tickets) {
          for(Integer i : innerList) {
              
            if (i < minValue && i >= 20)
                minValue = i;
            if(i > maxValue && i <= 500) 
                maxValue = i;
          }     
        }
            
        return Arrays.asList(minValue, maxValue);
          
        }
}