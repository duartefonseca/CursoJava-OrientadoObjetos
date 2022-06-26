package Aula08_GET_SET;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Kia");

        System.out.println(carro.getMarca());
    }
}
