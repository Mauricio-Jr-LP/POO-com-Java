package Modell;

public class Conta 
{
    private int conta;
    private String nome;
    private float saldo;
    
    public Conta(int conta, String nome, float saldo)
    {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta() {}

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    } 
}