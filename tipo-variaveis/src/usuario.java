public class usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    SmartTv smartTv = new SmartTv();
   
    smartTv.dimnuirVolume();
    smartTv.dimnuirVolume();
    smartTv.dimnuirVolume();
    smartTv.aumentarVolume();

System.out.println("Tv Ligada ? "  +smartTv.ligada);
System.out.println("Canal atual ? " +smartTv.canal);
System.out.println("Volume da Tv: " + smartTv.volume);

smartTv.ligar();
System.out.println("Novo Status <- Tv Ligada ? "  +smartTv.ligada);

}
}
