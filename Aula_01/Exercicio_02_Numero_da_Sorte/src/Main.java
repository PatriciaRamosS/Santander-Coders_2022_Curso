/*
* //Patricia da Silva Ramos
*
* Faça um programa que dado a idade em uma variável inteira, adicione as casas decimais: ".023".
* Após imprima a mensagem "O número da sorte é: " e imprima o número resultante.
* Para isso, utilize alguma forma de casting.
 * */
import java.util.Scanner;

public class Main {

    //Allows user to receive console input
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Create double type variable
        System.out.print("Digite sua idade: ");

        // Method
        int age = scan.nextInt();

        // Número da sorte
        double numSort = 0.023;

        // Sum and convert
        double sum = (double)age + numSort;

        //Data output
        System.out.println("Seu número da sorte é: " + sum);

    }
}