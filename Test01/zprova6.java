import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class zprova6 {
    public static void main(String[] args) {

        System.out.println(checaNumeroEscondido(12345,235));
    }

    public static boolean checaNumeroEscondido(Integer numero,Integer numeroOculto) {
    
        String numeroS = String.valueOf(numero);
        String numeroOcultoS = String.valueOf(numeroOculto);
        List<Integer> numeros = new ArrayList<>();

            for(int i = 0; i < numeroOcultoS.length(); i++) {
                
                String subn = numeroOcultoS.substring(i, i+1);
                if(numeroS.contains(subn)) 
                        numeros.add(Integer.parseInt(subn)); 
            }
        
        String numeroString = numeros.stream().map(Object::toString)
        .collect(Collectors.joining(""));
   
        if(numeroString.equals(numeroOcultoS))
            return true;

        return false;   
    }
}