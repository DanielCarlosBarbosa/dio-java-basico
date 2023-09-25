public class Usuario {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.canal = 23;

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(23);

        /*
        System.out.println("Volume inicial: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //System.out.println("TV ligada? " + smartTv.ligada);
        //System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //smartTv.ligar(); 
        //System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        //smartTv.desligar();
        //System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        */
    }
}
