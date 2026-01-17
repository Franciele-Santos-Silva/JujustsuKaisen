package atvPOO;

public class Main {
    public static void main(String[] args) {

        YujiItadori yudi = new YujiItadori("Yudi Itadori", 100, 70);
        System.out.println(yudi.getNome());
        System.out.println(yudi.getForca());

        MegumiFushiguro megumi = new MegumiFushiguro("Megumi Fushiguro", 70, 50);
        System.out.println(megumi.getNome());
        System.out.println(megumi.getForca());

        megumi.energiaAmaldicoada();

        SatoruGojo satoru = new SatoruGojo("Satoru Gojo", 100, 100);
        System.out.println(satoru.getNome());
        System.out.println(satoru.getForca());
        System.out.println("Velocidade: "+satoru.getVelocidade());




   }

}