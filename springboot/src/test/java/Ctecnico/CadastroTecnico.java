package Ctecnico;

public class CadastroTecnico {
    public String nome;
    public String formação;
    public int idade;

    public CadastroTecnico (String nome, String formação, int idade){
        this.nome=nome;
        this.formação=formação;
        this.idade=idade;
    }
    public void imprimir(){
        System.out.println("O tecnico "+ nome +"formado em "+ formação + "tem "+idade +"anos");
    }
}
