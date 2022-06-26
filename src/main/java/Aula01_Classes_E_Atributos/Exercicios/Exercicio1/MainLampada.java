package Aula01_Classes_E_Atributos.Exercicios.Exercicio1;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "modelo";
        lampada.cor = "branca";
        lampada.potencia = 100;
        lampada.tensao = "24W";
        lampada.garantiaMeses = 24;
        lampada.preco = 9.99;

        System.out.println(lampada);
    }
}
