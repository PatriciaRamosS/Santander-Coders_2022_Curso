import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1 - Coca-Cola - R$ 5");
        System.out.println("2 - Coca-Cola 0 - R$ 4.50");
        System.out.println("3 - Pepsi - R$ 4,40");
        System.out.println("4 - Guaraná Antarctica - R$ 3,50");
        System.out.println("5 - Fanta Laranja - R$ 4,23");
        System.out.println("6 - Água - R$ 2,50");

        System.out.println("Digite o número da bebida desejada: ");
        String input = sc.nextLine().toUpperCase().trim();

        switch (input) {
            case "1":  input = "Coca-Cola - R$ 5";
                break;
            case "2":  input = "Coca-Cola 0 - R$ 4.50";
                break;
            case "3":  input = "Pepsi - R$ 4,40";
                break;
            case "4":  input = "Guaraná Antarctica - R$ 3,50";
                break;
            case "5":  input = "Fanta Laranja - R$ 4,23";
                break;
            case "6":  input = "Água - R$ 2,50";
                break;
            default:
                System.out.println("Houve um erro inesperado!");
                break;
        }
        System.out.println(input);

    }
}