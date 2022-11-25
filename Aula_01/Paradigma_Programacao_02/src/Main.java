import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        // Paradigma Funcional
        BinaryOperator<Integer> soma = (a, b) -> a+b;

        // O Java intende por inferencia que está sendo utilizada valores do tipo Inteiro
        int resultado = soma.apply(2, 3);

        System.out.println("Soma = " + resultado);
    }
}