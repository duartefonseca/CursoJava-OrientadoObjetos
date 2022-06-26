package Aula09_SobrecargaDeMetodosConstrutores_Overload;

public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.soma(1, 2);
        calc.soma(1.0,2.0);
    }
}
