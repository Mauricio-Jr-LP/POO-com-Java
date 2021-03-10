package br.com.caixa.control;

import java.util.ArrayList;
import br.com.caixa.model.Caixa;

public class CaixaDao 
{
    ArrayList<Caixa> b = new ArrayList<>();
    
    public ArrayList<Caixa> lista()
    {
        return b;
    }
    
    public boolean incluir(Caixa c)
    {        
            return b.add(c);
    }
    
    public ArrayList<Caixa> listar()
    {
        return b;
    }
    
    public boolean alterar(Caixa c)
    {    
        for (int a = 0; a < b.size(); a++)
        {
            if (b.get(a).getRegistro()==c.getRegistro()) 
            {
                b.set(a,c);
                return true;
            }
        }
        return false;
    }
    
    public boolean excluir(Caixa c)
    {    
        for (int a = 0; a < b.size(); a++)
        {
            if (b.get(a).getRegistro() == c.getRegistro()) 
            {
                b.remove(a);
                return true;
            }
        }
        return false;
    }
    
    
    public Caixa buscar(int x)
    {
     for (int a = 0; a < b.size(); a++)
     {
         if (b.get(a).getRegistro()== x)
             return b.get(a);
     }
     return null;
    }
    
}
