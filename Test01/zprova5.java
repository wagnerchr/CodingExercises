import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zprova5 {
    
    public static void main(String[] args) {
                           
        System.out.println(
        calculaPorcentagemSorteio(Arrays.asList(false,false),Arrays.asList(61,120)));
    }

    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante,List<Integer> minutosAssistidos) {
      
        List<Double> chanceArr = new ArrayList<>();
        List<Integer> chances = new ArrayList<>();

        for(int i = 0; i < minutosAssistidos.size(); i++) {

            int count = minutosAssistidos.get(i);

            if(assinante.get(i)) {
            while( minutosAssistidos.get(i) % 2 != 0 ) { 
                minutosAssistidos.set( minutosAssistidos.indexOf(minutosAssistidos.get(i)), count );
                count++;
            }} 

            System.out.println("000000000000000000");
            

            if( assinante.get(i) ) {
                Double assinanteM = Math.ceil( (float)minutosAssistidos.get(i) / 60) * 2;
                chanceArr.add(assinanteM );
            } else {
                Double assinanteM =  Math.ceil( (float)minutosAssistidos.get(i) / 60);
                chanceArr.add( assinanteM );
            }

           
        }

        

        int total = 0;
        for(double c : chanceArr) 
            total += c;
        

        for(int i = 0; i < chanceArr.size(); i++) {

            if( minutosAssistidos.get(i) % 2 != 0 ) {
                Double valor = (  Math.ceil(( chanceArr.get(i) * 100)  / total));
                chances.add((int)Math.round(valor));
            } else {
                Double valor2 = (( chanceArr.get(i) * 100)  / total);
                chances.add((int)Math.round(valor2));
            }
        }

        return chances ;
    }

}