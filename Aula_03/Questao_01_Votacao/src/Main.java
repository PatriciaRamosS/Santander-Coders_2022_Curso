import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            if((idade >= 18)&&(idade <= 70)) {
                System.out.println("Voto obrigatório");
            }
            else if((idade >= 16)&&(idade < 18)||(idade > 70)) {
                System.out.println("Voto  facultativo");
            } else {
                System.out.println("Sem direito a votar");
            }
        }catch (Exception e) {
            // tratamento de erro
            System.out.println("Houve um erro inesperado!");
            System.out.println(e);
        }
    }
}