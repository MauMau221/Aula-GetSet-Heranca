public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Mauricio");
        pessoaFisica.setEndereco("Rua tal");
        pessoaFisica.setCpf("44444444");
        pessoaFisica.juntar();
        System.out.println(pessoaFisica.getCpf());
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa");
        pessoaJuridica.setEndereco("Rua tal");
        pessoaJuridica.setCnpj("0000001");
        pessoaJuridica.juntar();
        System.out.println(pessoaJuridica.getCnpj());
       
    }
}