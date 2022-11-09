import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class zprova1 {
	public static void main(String[] args) {

		List<Integer> actual0 = new ArrayList<>();
		actual0.add(2);
		actual0.add(15);
		actual0.add(22);
		actual0.add(11);

		System.out.println(	ultimaParada(2,8,Arrays.asList(2,15,22,11)) );
	}

	public static Integer ultimaParada(Integer combustivel,Integer consumo,List<Integer> postosDeGasolina) {
      
        postosDeGasolina.sort(null);
		int i = postosDeGasolina.size() - 1;
      
           while ( consumo * combustivel - postosDeGasolina.get(i) < 0 ) {              
                 i--;
             if(i < 0)
               return -1;
           }
        
		return postosDeGasolina.get(i);
    }
}