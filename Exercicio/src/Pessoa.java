import java.util.Date;

public class Pessoa {

    String nome;
    private String dataNascimento;
    private int idade;

    public Pessoa(int idade){
        this.idade = idade;

    }
    public Pessoa(){
    }
    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }
}
