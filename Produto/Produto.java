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
    
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void juntar(){
        System.out.printf("%s \n", nome);
        System.out.printf("%s \n", endereco);
    }
    
    
}
