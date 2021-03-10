/*+cadastrar(); void
- listar():String
+entrada(quantidade;float):boolean
+saida(quantidade;float);boolean*/

package Controll;

import Modell.Produto;

public class ProdutoControll 
{
    Produto produto = new Produto();
    
    public void cadastrar(Produto p)
    {
        this.produto = p;
    }
    
    public Produto listar()
    {
        return produto;
    }

    public boolean entrada(float quant)
    {
        if(quant<=0) return false;
        produto.setPreço(produto.getPreço()+quant);
        return true;
    }
    
    public boolean saida(float quant)
    {
        if(quant<=0 || quant>quant ) return false;
        produto.setPreço(produto.getPreço()-quant);
        return true;
    }
    
    
}
