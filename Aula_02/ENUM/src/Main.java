public class Main {
    public static void main(String[] args) {

        Float firstQuarterTotalExpense = Trimestre.JANUARY_EXPENSE.getValor() +
                Trimestre.FEBRUARY_EXPENSE.getValor() + Trimestre.MARCH_EXPENSE.getValor();

        System.out.printf("O gasto total no trimestre é: R$ %.2f.\n %n", firstQuarterTotalExpense);

        String mes = "JANUARY_TRIMESTRE";
    }
}