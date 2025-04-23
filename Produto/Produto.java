public class Produto {

    private String nome;
    private String categoria;
    private Number codigo;
    private Number preco;
    

    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public Number getCodigo(){
        return codigo;
    }

    public void setCodigo(Number codigo) {
        this.codigo = codigo;
    }

    public Number getPreco(){
        return preco;
    }

    public void setPreco(Number preco){
        this.preco = preco;
    }

    public void juntar(){
        System.out.printf("%s \n", nome);
        System.out.printf("%s \n", categoria);
        System.out.printf("%s \n", codigo);
        System.out.printf("%s \n", preco);
    }
    
    
    
    
    
    
    
    
}
