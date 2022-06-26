package Aula01_Classes_E_Atributos.Exercicios.Exercicio2;

public class Livro {
    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    double preco;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", anoLancamento=" + anoLancamento +
                ", preco=" + preco + "€" +
                '}';
    }
}

