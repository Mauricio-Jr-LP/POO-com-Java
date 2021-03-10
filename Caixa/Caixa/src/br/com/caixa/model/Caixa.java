package br.com.caixa.model;

/**
 *
 * @author Mauricio
 */

public class Caixa 
{
    // Atributos
    private int registro;
    private char tipo;
    private float valor;
    private String descrição;

    // Construtor
    public Caixa(int registro, char tipo, float valor, String descrição) 
    {
        this.registro = registro;
        this.tipo = tipo;
        this.valor = valor;
        this.descrição = descrição;
    }
    
    public Caixa(){}
    
    //Getter e Setter

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    // toString para listar
    public String toString() 
    {
        return "Registro: " + getRegistro() + "\nDescrição: " + getDescrição() 
            +"\nTipo: " + getTipo() + "\nValor: " + getValor();
    }
}