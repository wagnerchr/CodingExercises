import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class zprova9 {
    public static void main(String[] args) {
        System.out.println(menorStringMaior("nextgen"));
    }

    public static String menorStringMaior(String name) {
   
        List<String> nomeR = new ArrayList<String>();

        if(name.equals(""))
            return "sem resposta";
        for(int i = 0; i < name.length(); i++) 
            nomeR.add(String.valueOf(name.charAt(i)));
    //
        for(int i = nomeR.size() - 1; i > 0; i--) {
           
            String nomeS = nomeR.stream().map(Object::toString)
                        .collect(Collectors.joining(""));
            
            if( nomeS.charAt(i) > nomeS.charAt(i - 1) ) {
                    String v = nomeR.get(i - 1);
                  
                    for(int h = nomeS.length() - 1; ;h-- ) {

                        System.out.println(nomeR.get(h));

                        if( nomeR.get(h) == v) {

                            nomeR.remove(h);
                            nomeR.add(v);
                            break;
                        }         
                    }

                    String nomeSS = nomeR.stream().map(Object::toString)
                        .collect(Collectors.joining(""));

                if(i + 1 > name.length() - 1)
                    break;


                if( nomeSS.charAt(i) > nomeSS.charAt(i + 1))  {
                    String vv = nomeR.get(i);
                    nomeR.remove(v);
                    
                    nomeR.remove(vv);
                    nomeR.add(vv);
                    nomeR.add(v);
                  
                   String nomeSSS = nomeR.stream().map(Object::toString)
                        .collect(Collectors.joining(""));

                    if(nomeSSS.charAt(i) > nomeSSS.charAt(i + 1)) {
                        String a = nomeR.get(i);
                        nomeR.remove(a);
                        nomeR.add(a);
                        
                    } 
                    
                  break;
                }              
            }      
        }
        
        String nomeS = nomeR.stream().map(Object::toString)
        .collect(Collectors.joining(""));

       if(nomeS.equals(name))
          return "sem resposta";

        return nomeS;

        }
}

/*
 List<String> nomeR = new ArrayList<String>();
      System.out.println(name);
    

        for(int i = name.length() - 1; i > 0; i--) {


            if( name.charAt(i) > name.charAt(i - 1) ) {
                int k = 0;
                do {
                    if(!nomeR.contains(String.valueOf(name.charAt(k) )))
                        nomeR.add(String.valueOf(name.charAt(k)) );
                    k++;
                } while( name.charAt(k + 1) < name.charAt(i) );

                nomeR.add(String.valueOf(name.charAt(i)) ); 
                nomeR.add(String.valueOf(name.charAt(i - 1)) );
                break;
                    
            }
                return "sem resposta"; 
        }
        
        String numeroString = nomeR.stream().map(Object::toString)
        .collect(Collectors.joining(""));

        return numeroString;
 */