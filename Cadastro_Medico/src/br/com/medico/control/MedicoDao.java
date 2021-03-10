 package br.com.medico.control;

/**
 *
 * @author Mauricio
 */

import br.com.medico.model.Medico;
import java.util.ArrayList;

public class MedicoDao 
{
    ArrayList <Medico> base = new ArrayList<>();
    
    public ArrayList<Medico> lista()
    {
        return base;
    }
    
    public boolean cadastrar(Medico medico)
    {
        return base.add(medico);
    }
    
    public Medico buscar(int x)
    {
        for(int y = 0; y < base.size(); y++)
        {
            if(base.get(y).getCrm() == x)
            {
                return base.get(y);
            }
        }
        
        return null;
    }
    
    public boolean alterar(Medico medico)
    {
        for(int x = 0; x< base.size(); x++)        
        {
            if(base.get(x).getCrm() == medico.getCrm())
            {
                base.set(x,medico);
                return true;
            }         
        }
    return false;
    }
    
    public boolean excluir(Medico medico)
    {
        for(int x = 0; x < base.size(); x++)
        {
            if(base.get(x).getCrm() == medico.getCrm())
            {
                base.remove(x); return true;
            }
        }
        
        return false;
    }
}