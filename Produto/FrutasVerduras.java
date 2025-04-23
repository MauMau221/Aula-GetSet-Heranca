public class FrutasVerduras extends Produto {
    private Number peso;

    public Number getPeso() {
        return peso;
    }

    public void setPeso(Number peso) {
        this.peso = peso;
    }

    @Override
    public void juntar() {
        super.juntar();
        System.out.printf("%s kg\n", peso);
    }
} 