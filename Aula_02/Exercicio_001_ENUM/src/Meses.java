public enum Meses {

    JANEIRO (2956.25F),
    FEVEREIRO (2356.58F),
    MARCO (1547.99F),
    ABRIL (58693.74F),
    MAIO (2500.35F),
    JUNHO (2903.14F),
    JULHO (5247.45F),
    AGOSTO (2903.50F),
    SETEMBRO (5755.96F),
    OUTUBRO (13658.74F),
    NOVEMBRO (157558.85F),
    DEZEMBRO (55754.24F);


    private float gastoTotal;

    Meses(float gastoFinal){
        this.gastoTotal = gastoFinal;
    }

    public float getGastoTotal() {
        return gastoTotal;
    }
}
