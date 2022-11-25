public class Main {



    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        // Variável do tipo Calculadora
        Calculadora minhaCalculadora = new Calculadora(a, b);

        System.out.println("Soma = " + minhaCalculadora.soma());

        new Calculadora(a, b); //O operador new cria um novo objeto a partir de uma classe especificada
        // e retorna uma referência para este objeto.



    }
}

/*
 *   Paradigma de programação
 *
 *    Um paradigma de programação define como a linguagem vai se comportar e como ela vai ser executada.
 *    Existe certas classificaçõe de paradigma de programação.
 *
 *
 *
 *    Paradigma imperativo e procedural.
 *
 *    É executada instrução por instrução. As instruções são repassadas ao computador na sequência em que elas
 *    são executadas.
 *
 *    Paradigma funcional
 *
 *    O paradigma funcional é aquele que destaca o uso das funções onde o problema é dividido em blocos e,
 *    para sua resolução, são implementadas atribuições que definem variáveis em seu escopo que podem ou não retornar resultados.
 *
 *    Funções
 *
 *
 *
 *   Paradigma imperativo
 *
 *   É passado através do código o que ele deve fazer e como ele deve fazer.
 *
 *   Paradigma Funcional
 *
 *
 *
 * */