class zprova7 {

    public static void main(String[] args) {

        System.out.println(calculaTotalLeds(2, 3));
    }

    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
        if(largura == 0 || altura == 0)
           return 0;
       return (largura + 1) * (altura + 1);
   }
}