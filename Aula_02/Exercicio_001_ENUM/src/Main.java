/*
*Faça um programa, que solicite ao usuário que informe o mês e o sistema deve imprimir o valor gasto do mês.

->Considerações:

Utilizar enum
Criar um valor para cada mês
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean tratamentoErro = true;

        while (tratamentoErro) {

            System.out.println("Digite o mês que que deseja saber o total de gasto:  ");
            String mesTotalGasto = scan.nextLine().toUpperCase().trim();

            try {

                Float gastoMes = Meses.valueOf(mesTotalGasto).getGastoTotal();
                System.out.printf("O gasto total no mês %s foi: %.2f\n", mesTotalGasto, gastoMes);
                tratamentoErro = false;

            } catch (Exception e) {

                System.out.println("Entrada incorreta!\n Por favor, digite um  mês válido!");
            }
        }
    }
}