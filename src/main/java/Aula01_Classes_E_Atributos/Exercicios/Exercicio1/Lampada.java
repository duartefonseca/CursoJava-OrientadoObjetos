package Aula01_Classes_E_Atributos.Exercicios.Exercicio1;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    int garantiaMeses;
    double preco;

    @Override
    public String toString() {
        return "Lampada{" +
                "modelo='" + modelo + '\'' +
                ", tensao='" + tensao + '\'' +
                ", potencia=" + potencia +
                ", cor='" + cor + '\'' +
                ", garantiaMeses=" + garantiaMeses +
                ", preco=" + preco +
                '}';
    }
}

