public class Calculadora {

    int a;
    int b;

    public Calculadora(int a, int b) { // Essas é uma classe Calculadora, estamos modelando o que viria a ser o objeto do tipo calculadora
        this.a = a;                     // Então ele recebe duas variáveis, int (a, b)
        this.b = b;                     // Essas duas variáveis tem como objetivo guarda o estado do objeto
        // O estado do objeto são os "valores" que contém esse objeto
    }
    //Função
    int soma() {
        return a + b;
    }
}


