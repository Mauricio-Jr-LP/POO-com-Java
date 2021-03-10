package br.com.clientes.modelo;

public class Caixa {
    private int registro;
    private String descricao;
    private float valor;
    private char tipo; 

    public Caixa() {
    }

    public Caixa(int registro, String descricao, float valor, char tipo) {
        this.registro = registro; 
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public String toString(){
        return "Registro: "+getRegistro()+" - Descrição: "+getDescricao()+" - Tipo: "+getTipo()+ " - Valor: "+getValor();
    }
   
}
