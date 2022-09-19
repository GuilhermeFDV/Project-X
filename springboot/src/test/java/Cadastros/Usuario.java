package Cadastros;

public class Usuario extends CadastroPessoa {
    public String problema;

    public Usuario (String nome, String problema, int telefone, int cpf, int cep, String bairro, String complemento, int numero){
        super(nome,telefone,cpf,cep,bairro,complemento,numero);
        this.problema=problema;
    }
}