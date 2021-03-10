package modell;

public class Medico 
{
    private int crm;
    private String nome;
    private String especialidade;
    private float receita;
    
    public Medico(int crm, String nome, String especialidade, float receita) 
    {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.receita = receita;
    }

public Medico(){}

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getReceita() {
        return receita;
    }

    public void setReceita(float receita) {
        this.receita = receita;
    }
    
}