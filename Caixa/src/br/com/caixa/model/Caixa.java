package br.com.caixa.model;

public class Caixa 
{
    private int registro;
    private String tipo;
    private float valor;
    private float saldo;
    private String nome;
    
    
    public Caixa(){}
    
    public Caixa(String nome, int registro, String tipo,float valor,float saldo)
    {
        this.registro = registro;
        this.saldo = saldo;
        this.tipo = tipo;
        this.valor = valor;
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() 
    {
        return "registro:" + registro + ", tipo:" + tipo + ", valor:" + valor + 
                ", saldo:" + saldo + ", nome:" + nome;
    }

}
