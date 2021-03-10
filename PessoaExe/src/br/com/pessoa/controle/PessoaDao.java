
package br.com.pessoa.controle;

import br.com.pessoa.modelo.Pessoa;
import java.util.ArrayList;

public class PessoaDao {
    ArrayList<Pessoa> base = new ArrayList<>();
    
    public boolean inserir(Pessoa p){        
            return base.add(p);
    }
    
    public ArrayList<Pessoa> consulta(){
        return base;
    }
    
    public Pessoa pesquisa(int c){
     for (int x = 0; x < base.size() ; x++){
         if (base.get(x).getCodigo()==c)
             return base.get(x);
     }
     return null;
    }
    
    public boolean deletar(Pessoa p){
        
        for (int x=0 ; x < base.size() ; x++){
            if (base.get(x).getCodigo()==p.getCodigo()) {
                base.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public boolean alterar(Pessoa p){
        
        for (int x=0 ; x < base.size() ; x++){
            if (base.get(x).getCodigo()==p.getCodigo()) {
                base.set(x,p);
                return true;
            }
        }
        return false;
    }
}
