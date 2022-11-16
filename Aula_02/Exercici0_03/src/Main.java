import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();

        String[] split = nome.split(" ");


        for (int i = 0; i < split.length; i++) {
            split[i] = "!"+split[i];
            System.out.printf(split[i] + " ");

        }
    }
}