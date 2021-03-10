/*              ClienteDao 
------------------------------------------- 
- cliente[]:Cliente 
--------------------------------------------- 
+cadastrar(Cliente c):boolean 
+alterar(Cliente c):boolean 
+excluir(Cliente c):boolean  
+exibirTodos():Cliente[] 
+buscar(int reg):Cliente 
+isEmpty():boolean 
+isFull():boolean*/

package Controll;

import Modell.Cliente;

public class ClienteDao 
{
    Cliente[] cliente = new Cliente();
    
    public boolean cadastrar(Cliente cliente)
    {
        this.cliente = cliente;
        return true;
    }
    
    public boolean alterar(Cliente cliente)
    {
        this.cliente = cliente;
        return true;
    }
    
    public boolean excluir(Cliente cliente)
    {
        this.cliente = null;
        return true;
    }
    
    public Cliente exibir_todos()
    {
        return cliente;
    }
    
    public Cliente buscar(int codigo)
    {
        for(int y = 0; y == codigo; y++)
        {
            return cliente;
        }
        return null;
    }
    
    public boolean isEmpyt(Cliente c)
    {
        
    }
    
    public boolean isFull(Cliente c)
    {
        
    }
}
