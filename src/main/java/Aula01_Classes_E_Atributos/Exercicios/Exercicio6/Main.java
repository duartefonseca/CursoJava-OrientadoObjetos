package Aula01_Classes_E_Atributos.Exercicios.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto();
        contacto1.nome = "Duarte";
        contacto1.email = "duarte@gmail.com";

        contacto1.telefones = new String[2];
        contacto1.telefones[0] = "912345678";
        contacto1.telefones[1] = "918765432";

        System.out.println(contacto1);
    }
}
