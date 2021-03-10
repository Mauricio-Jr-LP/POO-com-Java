package controll;

import modell.Medico;

public class MedicoDao 
{
    Medico medico = new Medico();
    
    public void cadastrar(Medico m)
    {
        this.medico = m;
    }
    
    public Medico listar()
    {
        return medico;
    }
    
    public boolean faturar(float valor)
    {
        if (valor<=0) return false;
        medico.setReceita(medico.getReceita()+valor);
        return true;
    }
    
    public boolean pagarImpostos(float valor)
    {
        if(valor>=medico.getReceita()) return false;
        medico.setReceita(medico.getReceita()-valor);
        return true;
    }
    
}
