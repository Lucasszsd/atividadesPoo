import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(20);
        Pessoa pessoa2 = new Pessoa("Lucas","05/10/1994");

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa2.getNome() +" "+ pessoa2.getDataNascimento());

    }
}