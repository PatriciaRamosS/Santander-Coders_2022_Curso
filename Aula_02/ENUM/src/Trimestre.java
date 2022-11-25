// Todas as vriáveris defclaradas dentro de um ENUM são static e são final
// ENUM é um número limitado de constante
//São tipos de campos que consistem em um conjunto fixo de constantes (static final),
// sendo como uma lista de valores pré-definidos.



public enum Trimestre {
    JANUARY_EXPENSE (10000F, "valor do mes"),
    FEBRUARY_EXPENSE (17000F, "valor do mes"),
    MARCH_EXPENSE (23000F, "valor do mes");

    private float valor;
    private String mes;

    Trimestre(float valor, String mes){
        this.valor = valor;
        this.mes = mes;

    }

    public float getValor() {
        return valor;
    }

    public String getMes() {
        return mes;
    }

}
