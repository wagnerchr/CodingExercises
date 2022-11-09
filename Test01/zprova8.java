public class zprova8 {
   

    // DANGER ! NOT READY
    public static void main(String[] args) {

        System.out.println(escolheTaxi("2.5","1.0","5.0","0.75"));
    }

    public static String escolheTaxi(String tf1,String vqr1,String tf2,String vqr2) {
      
        float tf1F = Float.valueOf(tf1);
        float tf2F = Float.valueOf(tf2);
        float vqr1F = Float.valueOf(vqr1);
        float vqr2F = Float.valueOf(vqr2);

        double km = 1;
        String empresaP = "";
        String empresaD = "";

        if(tf1F + vqr1F == tf2F + vqr2F)
            return "Tanto faz";

        if(tf1F + vqr1F < tf2F + vqr2F) {
            while( tf1F + (vqr1F * km) < tf2F + (vqr2F * km)) {
                km += 0.001;
               
                empresaP = "Empresa 1";
                empresaD = "Empresa 2";
                if(km > 20)
                    return empresaP;
            }
        } 
        else {
            while( tf1F + (vqr1F * km) > tf2F + (vqr2F * km)) {
                km += 0.001;
                
                empresaP = "Empresa 2";
                empresaD = "Empresa 1";

                if(km > 20)     
                     return empresaP;
            }
        }

    // “Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0”
        String resposta = "";
        String kms = "";

        kms = String.format("%.2f", (float)km); 
        
        if(String.valueOf(kms.charAt(3)).equals("0") )
            kms = String.format("%.1f", (float)km); 
      
        resposta = empresaP + " quando a distância < " + kms + ", Tanto faz quando a distância = " + kms + ", " + empresaD + " quando a distância > " + kms;

        return resposta;
    }
}
