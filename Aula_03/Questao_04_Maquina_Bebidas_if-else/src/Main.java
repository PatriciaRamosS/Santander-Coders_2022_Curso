import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Coca-Cola - R$ 5");
        System.out.println("2 - Coca-Cola 0 - R$ 4.50");
        System.out.println("3 - Pepsi - R$ 4,40");
        System.out.println("4 - Guaraná Antarctica - R$ 3,50");
        System.out.println("5 - Fanta Laranja - R$ 4,23");
        System.out.println("6 - Água - R$ 2,50");

        System.out.println("Digite o número da bebida desejada: ");
        int input = sc.nextInt();

        if(input == 1) {
            System.out.println("Coca-Cola - R$ 5");
        }
        else if(input == 2) {
            System.out.println("Coca-Cola 0 - R$ 4.50");
        }
        else if(input == 3) {
            System.out.println("Pepsi - R$ 4,40");
        }
        else if(input == 4) {
            System.out.println("Guaraná Antarctica - R$ 3,50");
        }
        else if(input == 5) {
            System.out.println("Fanta Laranja - R$ 4,23");
        }
        else if(input == 6){
            System.out.println("Água - R$ 2,50");
        }
        else {
            System.out.println("Houve um erro inesperado!");
        }
    }
}