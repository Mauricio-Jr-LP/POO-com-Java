package br.com.medico.control;

/**
 *
 * @author Mauricio
 */

import br.com.medico.model.Medico;
import java.util.ArrayList;

public class MedicoDao 
{
    Medico medico = new Medico();
    ArrayList <Medico> base = new ArrayList<>();
    
    public boolean cadastrar(Medico m)
    {
        return base.add(m);
    }
    
    /*public ArrayList<Medico> lista()
    {
    return base;
    }*/
    
    public ArrayList<Medico> lista()
    {
        return base;
    }
    
    public boolean faturar(float valor)
    {
        if (valor<=0) return false;
        medico.setReceita(medico.getReceita()+valor);
        return true;
    }
    
    public boolean pagarImpostos(float valor)
    {
        if(valor>=medico.getReceita() || valor>valor) return false;
        medico.setReceita(medico.getReceita()-valor);
        return true;
    }
    
}