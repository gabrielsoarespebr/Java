public class Usuario{
    public static void main (String [] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("MOMENTO 1");
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("");
        System.out.println("MOMENTO 2");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("");
        System.out.println("MOMENTO 3");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("");
        System.out.println("MOMENTO 4");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirCanal();
        System.out.println("");
        System.out.println("MOMENTO 5");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("");
        System.out.println("MOMENTO 5");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
    }
}