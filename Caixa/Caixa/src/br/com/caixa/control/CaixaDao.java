package br.com.caixa.control;

/**
 *
 * @author Mauricio
 */

import br.com.caixa.model.Caixa;
import java.util.ArrayList;

public class CaixaDao 
{
    ArrayList <Caixa> base = new ArrayList<>();
    
    public ArrayList <Caixa> lista()
    {
        return base;
    }
    
    //Métodos
    public boolean incluir(Caixa caixa)
    {
        return base.add(caixa);
    }
    
    public boolean alterar(Caixa caixa)
    {
        for(int x = 0; x< base.size(); x++)        
        {
            if(base.get(x).getRegistro() == caixa.getRegistro())
            {
                base.set(x,caixa);
                return true;
            }         
        }
    return false;
    }
    
    public boolean excluir(Caixa caixa)
    {
        for(int x = 0; x < base.size(); x++)
        {
            if(base.get(x).getRegistro() == caixa.getRegistro())
            {
                base.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public Caixa buscar(int x)
    {
        for(int y = 0; y < base.size(); y++)
        {
            if(base.get(y).getRegistro() == x)
            {
                return base.get(y);
            }
        }
        
        return null;
    }
}