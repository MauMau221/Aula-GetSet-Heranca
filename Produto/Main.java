public class Main {

    public static void main(String[] args) {
        ProdutoLimpeza produtoLimpeza = new ProdutoLimpeza();
        produtoLimpeza.setNome("Detergente");
        produtoLimpeza.setCategoria("Limpeza");
        produtoLimpeza.setCodigo(123);
        produtoLimpeza.setPreco(5.99);
        produtoLimpeza.setSecao("Limpeza");
        produtoLimpeza.setPrateleira("A1");
        
        System.out.println("Produto de Limpeza:");
        produtoLimpeza.juntar();
        System.out.println("Seção: " + produtoLimpeza.getSecao());
        System.out.println("Prateleira: " + produtoLimpeza.getPrateleira());
        System.out.println();
        
        FrutasVerduras frutasVerduras = new FrutasVerduras();
        frutasVerduras.setNome("Maçã");
        frutasVerduras.setCategoria("Frutas");
        frutasVerduras.setCodigo(456);
        frutasVerduras.setPreco(3.50);
        frutasVerduras.setPeso(1.5);
        
        System.out.println("Frutas e Verduras:");
        frutasVerduras.juntar();
    }
}