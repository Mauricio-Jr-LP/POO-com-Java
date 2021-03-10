package br.com.clientes.control;

import br.com.clientes.modelo.Caixa;
import java.util.ArrayList;

public class CaixaDAO {
    ArrayList <Caixa> base = new ArrayList();
    
    public boolean incluir(Caixa c){
        return base.add(c);
    }
    
    public ArrayList<Caixa> consulta(){
        return base;
    }
    
    public Caixa buscar(int reg){
        for (int x = 0; x < base.size() ; x++){
         if (base.get(x).getRegistro()==reg)
             return base.get(x);
     }
     return null;
    }
    
    public boolean deletar(Caixa cx){
        
        for (int x=0 ; x < base.size() ; x++){
            if (base.get(x).getRegistro()==cx.getRegistro()) {
                base.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public boolean alterar(Caixa cx){
        
        for (int x=0 ; x < base.size() ; x++){
            if (base.get(x).getRegistro()==cx.getRegistro()) {
                base.set(x,cx);
                return true;
            }
        }
        return false;
    }
}
