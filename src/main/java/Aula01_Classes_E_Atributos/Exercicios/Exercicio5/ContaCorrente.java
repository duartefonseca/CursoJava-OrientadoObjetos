package Aula01_Classes_E_Atributos.Exercicios.Exercicio5;

public class ContaCorrente {

    int numeroConta;
    String nomeTitular;
    boolean contaEspecial;
    int limite;
    double saldo;

    @Override
    public String toString(){
        return "Numero Conta = " + numeroConta + "\n" +
                "Nome Titular = "+ nomeTitular + "\n" +
                "Conta Especial = "+ contaEspecial + "\n" +
                "Limite = " + limite + "\n" +
                "Saldo = " + saldo + "€";
    }
}
