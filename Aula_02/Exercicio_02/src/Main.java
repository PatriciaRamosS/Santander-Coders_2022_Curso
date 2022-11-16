import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
        String[] temp = texto.split(",");
        Integer sum=0;
        for(String aux: temp) {
            System.out.println(aux+"\n");
            sum += Integer.parseInt(aux.replaceAll("[^0-9]", ""));
        }
        System.out.println("Total: "+sum);
    }
}