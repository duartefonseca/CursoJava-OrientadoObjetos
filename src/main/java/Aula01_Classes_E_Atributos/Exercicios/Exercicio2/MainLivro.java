package Aula01_Classes_E_Atributos.Exercicios.Exercicio2;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Duarte";
        livro.nome = "Curso Java Orientado a Objetos";
        livro.anoLancamento = 2022;
        livro.qtdPaginas = 100;
        livro.preco = 1.0;

        System.out.println(livro);
    }
}
