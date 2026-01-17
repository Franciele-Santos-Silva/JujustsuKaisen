package atvPOO;

public class YujiItadori extends Feiticeiro implements Energia{
//    chama o construtor com parametros da superclass,todas as vezes que eu crio um construtor com parametros o java apaga o construtor padrão e com isso eu tenho que chamar o construtir padrão nas minhas subclasses para conseguir usar o atributo da superclasse
    public YujiItadori(String nome, int forca, int velocidade) {
        super(nome, forca, velocidade);//garante que o atributo nome da superclasse seeja inicializado
    }

    @Override
    public void energiaAmaldicoada(){
        System.out.println("Kokosen");
    }

    @Override
    public void dominio(){
        System.out.println("Sukuna");
    }

    @Override
    public void tecnicaAmaldicoada(){
      System.out.println("Sukuna++");
    }


}
