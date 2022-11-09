import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zprova10 {
    

    public static void main(String[] args) {


        System.out.println(shuffleMusicas(Arrays.asList(2,10,5,3)));
    }

    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
      
        List<Integer> musicas = new ArrayList<>(musicasTocadas);
        List<Integer> musicasR = new ArrayList<>();
        

        for(int i = 0; i < musicasTocadas.size(); i++) {

            if(i % 2 == 0) {
                musicasR.add(Collections.max(musicas));
                musicas.remove(Integer.valueOf( (Collections.max(musicas)) ));
            } else {
                musicasR.add(Collections.min(musicas));
                musicas.remove( Integer.valueOf( (Collections.min(musicas)) ));
            }

        }

        return musicasR;
    }
}
