package telanova;

public class Janela 
{
    private int idade;
    private String nome;
    
    public Janela(){}
    
    public Janela(int idade, String Nome)
    {
        this.idade = idade;
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
