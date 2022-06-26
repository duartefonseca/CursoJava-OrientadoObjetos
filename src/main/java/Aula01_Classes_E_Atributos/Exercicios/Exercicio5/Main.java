package Aula01_Classes_E_Atributos.Exercicios.Exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numeroConta = 123456;
        contaCorrente.nomeTitular = "Duarte";
        contaCorrente.contaEspecial = true;
        contaCorrente.limite = 1000;
        contaCorrente.saldo = 5000;

        System.out.println(contaCorrente);
    }
}
