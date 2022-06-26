package Aula01_Classes_E_Atributos.Exercicios.Exercicio4;

import java.util.Date;

public class LivroBiblioteca {
    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    double preco;

    boolean emprestado;
    Date dataEntrega;
    String nomePessoa;

    @Override
    public String toString() {
        return "LivroBiblioteca{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", anoLancamento=" + anoLancamento +
                ", preco=" + preco +
                ", emprestado=" + emprestado +
                ", dataEntrega=" + dataEntrega +
                ", nomePessoa='" + nomePessoa + '\'' +
                '}';
    }
}
