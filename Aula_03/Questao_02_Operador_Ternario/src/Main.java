/*
*System.out.println(1 == 1 ? "Verdadeiro" : "False");
*
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println(idade >= 18 && idade <= 70 ? "Voto obrigatório" :
                    idade >= 16 && idade < 18 || idade > 70 ? "Voto  facultativo" : "Sem direito a votar" );

        }catch (Exception e) {
            // tratamento de erro
            System.out.println("Houve um erro inesperado!");
            System.out.println(e);
        }
    }
}