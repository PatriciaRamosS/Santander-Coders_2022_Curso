/*
* A empresa "XPTO S.A", precisa fazer o fechamento do balanço do primeiro trimestre. Os dados passados pela empresa são:

Janeiro: R$ 10000
Fevereiro: R$ 17000
Marco: R$ 23000.
Faça um programa que calcule e imprima o gasto total do trimestre.
*
* */

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int gastosJaneiro = 10000;
        int gastosFevereiro = 17000;
        int gastosMarco = 23000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Total de Gastos do Trimestre = " + gastosTrimestre);
    }
}
