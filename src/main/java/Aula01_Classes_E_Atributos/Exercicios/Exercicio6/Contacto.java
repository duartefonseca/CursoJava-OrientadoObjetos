package Aula01_Classes_E_Atributos.Exercicios.Exercicio6;

import java.util.Arrays;

public class Contacto {
    String nome;
    String email;
    String[] telefones;

    @Override
    public String toString() {
        return "Exercicio6{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefones=" + Arrays.toString(telefones) +
                '}';
    }
}
