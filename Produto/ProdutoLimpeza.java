
public class ProdutoLimpeza extends Produto{

    private String secao;
    private String prateleira;

    public String getSecao(){
        return secao;
    }

    public void setSecao(String secao){
        this.secao = secao;
    }

    public String getPrateleira(){
        return prateleira;
    }   

    public void setPrateleira(String prateleira){
        this.prateleira = prateleira;
    }

}