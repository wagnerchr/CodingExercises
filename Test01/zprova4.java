import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class zprova4 {
  
    public static void main(String[] args) {
        System.out.println(calculaTopOcorrenciasDeQueries("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",Arrays.asList("a","em","i","el"),2));
    }
    public static List<String> calculaTopOcorrenciasDeQueries(String texto,List<String> queries,Integer k) {
        
        List<String> norepeat = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for(String q : queries) {
            if(!norepeat.contains(q)) {
                norepeat.add(q);
                count.add(0);
            }
        }

        for(int i = 0; i < norepeat.size(); i++) {

            int reader = norepeat.get(i).length();    
            for(int j = 0; (j + reader - 1) < texto.length(); j++) {
                String check = texto.substring(j, j + reader);   
                if(check.equals(norepeat.get(i))) {
                    count.set(i, count.get(i) + 1);
                }
            }
        }


        List<String> values = new ArrayList<String>();

        for(int i = 0; i < k; i++) {
            values.add(norepeat.get(count.indexOf(Collections.max(count))) ); 
            norepeat.remove(count.indexOf(Collections.max(count)));
            count.remove(count.indexOf(Collections.max(count)));    
        }

        return values ;
    
    }
    
}