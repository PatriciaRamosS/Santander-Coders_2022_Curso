public class Main {
    public static void main(String[] args) {

        //Formas de criar String
        String string = new String("Oi");
        String string2 = "Tchau";
        String vazia = "";

        Integer numero = 3 + 5;

        vazia += numero;
        System.out.println(vazia);


        System.out.println(3 + 5 + " Soma"); // Realiza soma quando os números são colocados incialmente
        System.out.println("Soma = " + 3 + 5); // Concatenação dos valores
        System.out.println("Soma = " + (3 + 5)); // Realiza a funcao somar

        // Concatenar
        System.out.printf("%n%n");
        System.out.println(" -- -- Concatenação -- -- ");
        String soma = "Somaooooo = ".concat(  numero + "");
        System.out.printf(soma + "%n%n");

        //Para saber quantos caracteres tem a Strings
        System.out.printf("%n%n");
        System.out.println(" -- -- Para saber quantos caracteres tem a Strings -- -- ");
        int tamanho = soma.length();
        System.out.println(tamanho); // Tamanho da String
        System.out.println(soma.charAt(1)); // Mostra o caractere que esta na posição 1 na String soma
        System.out.println(soma.indexOf('o')); // Mostra quala posição esta o caractere 'o' na String soma
        System.out.println(soma.indexOf('o', 2)); //
        System.out.println(soma.contains("a")); // Faz uma busca sequencia, em todas as posições do caractere, Busca Linear
        System.out.println(soma.contains("+")); // Verifica se o caractere faz parte da String
        System.out.println(soma.substring(3,6)); //Seleciona a String a partir da posição determinada
        System.out.printf("%n%n");

        String email1 = "teste@outlook.com";
        String[] split2 = email1.split("@"); // Separa a String email1 em duas parto @
        String[] split1 = split2;
        System.out.println(split1[0]);
        System.out.println(split1[1]);

        String email = "GaBriEl@hotmail.com";
        String[] split = email.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);

        String email2 = String.join("@",split[0], split[1], "Teste", "Vamo que Vamo"); // Junta Strings a partir do delimitador @
        System.out.println(email2.toUpperCase()); // Transforma a String em Caixa alta

        String MINUSCULA = "MINUSCULA";
        System.out.println(MINUSCULA.toLowerCase()); // Transforma a String em Caixa baixa

        //Remove os espaços tanto da direita quanto da esquerda
        String espaco = "   1 2 3 4 5   ";
        espaco = espaco.trim();
        System.out.println(espaco);

        //Replace substituir um caractere em uma String
        System.out.println(espaco.trim().replace("1", "Q"));

        System.out.println(espaco.trim().replace(" ", "")); // Retira os espaços da String

        String nome1 = "gabriel";
        String aux = "gabriel";
        String nome2 = "    gabriel";
        String nome3 = " GabRIEl ";
        String nome4 = " Ga bR IEl ";
        String nome5 = " Ga bRIvEl ";

        // Compara uma String utilizando o Equals
        System.out.println(nome1.equals(aux)); // Returns true because they are equal
        System.out.println(nome1.equals(nome2)); // false because they are not equal

        System.out.println(nome1.equals(nome2.trim())); // Da true pois eu retirei o espaço quer continha no inicio da String


        System.out.println(nome1.equalsIgnoreCase(nome3.trim())); // Da true pois eu retirei o espaço quer
        // continha no inicio da String e no final da String e coloquei equalsIgnoreCase() que ignora caso
        // a String tenha caracteres em Caixa Alta

        System.out.println(nome1.equals(nome4.toLowerCase().replace(" ", "")));
        System.out.println(nome1.equals(nome5.toLowerCase().replace(" ", "").replace("v", "")));


        System.out.printf("%n%n");
        System.out.printf("%n%n");


        String[] strArr = espaco.trim().split(" ");
        StringBuilder strFinal = new StringBuilder();
        for (String s : strArr) {
             strFinal.append(s); //Append em Java é um método de classe StringBuilder
                                // e StringBuffer usado para anexar um valor à sequência atual
        }

        System.out.println("->" + strFinal);

    }
}