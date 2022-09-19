package Cadastros;

public class Tecnico extends CadastroPessoa {
    public String formação;

    public Tecnico (String nome, String formação, int telefone, int cpf, int cep, String bairro, String complemento, int numero){
        super(nome,telefone,cpf,cep,bairro,complemento,numero);
        this.formação=formação;
    }
}