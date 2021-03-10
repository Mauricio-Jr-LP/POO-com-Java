package br.com.medico.model;

/**
 *
 * @author Mauricio
 */

public class Medico 
{
    private int crm;
    private String nome;
    private String especialidade;
    private char ação;
    private float valor;
    
    public Medico(int crm, String nome, String especialidade, char ação, 
        float valor) 
    {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ação = ação;
        this.valor= valor;
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

    public char getAção() {
        return ação;
    }

    public void setAção(char ação) {
        this.ação = ação;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() 
    {
        return "Crm:" + getCrm() + "\nNome:" + getNome() + "\nEspecialidade:" 
            + getEspecialidade()+ "\nValor:" +getValor()+ "\nAção: " +getAção();
    }
}
