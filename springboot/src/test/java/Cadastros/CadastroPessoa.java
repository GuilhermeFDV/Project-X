package Cadastros;

public class CadastroPessoa {
    public String nome;
    public int telefone;
    public int cpf;
    public int cep;
    public String bairro;
    public String complemento;
    public int numero;

    public CadastroPessoa (String nome, int telefone, int cpf, int cep, String bairro, String complemento, int numero){
        this.nome=nome;
        this.telefone=telefone;
        this.cpf=cpf;
        this.cep=cep;
        this.bairro=bairro;
        this.complemento=complemento;
        this.numero=numero;
    }
}
