package Controll;

import Modell.Conta;

public class Conta_Controll 
{
    Conta conta = new Conta();
    
    public void cadastar(Conta c)
    {
        this.conta = c;
    }
    
    public Conta listar()
    {
        return conta;
    }
    
    public boolean depositar(float valor)
    {
        if(valor<=0) return false;
        conta.setSaldo(conta.getSaldo()+valor);
        return true;
    }
    
    public boolean sacar(float valor)
    {
        if(conta.getSaldo() >= 0 || conta.getSaldo()<= valor ) return false;
        conta.setSaldo(conta.getSaldo()-valor);
        return true;
    }
    
}
