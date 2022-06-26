package Aula01_Classes_E_Atributos.Exercicios.Exercicio4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.nome = "Curso Java Orientado a Objetos";
        livroBiblioteca.autor = "Duarte";
        livroBiblioteca.anoLancamento = 2022;
        livroBiblioteca.qtdPaginas = 100;
        livroBiblioteca.preco = 1.0;

        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.nomePessoa = "Filipa";

        System.out.println(livroBiblioteca);
    }
}
