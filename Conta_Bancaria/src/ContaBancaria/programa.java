/*Faça um promagrama em java para movimentar um produto:
-----------------------------------------------------
                produto
-----------------------------------------------------
-codigo: int            
-nome: String           
-Quantidade: float      
-preço: float
-----------------------------------------------------
+cadastrar(); void
- listar():String
+entrada(quantidade;float):boolean
+saida(quantidade;float);boolean
----------------------------------------------------
*construtor
*Getter e Setter
*devera criar uma classe para executar o programa
*devera ter um menu para:
1 cadastrar
2 listar
3 Entrada produto
4 saida produto
5 sair
*nao podera dar saida com quantidade <=0
*/

package ContaBancaria;

import javax.swing.JOptionPane;

public class programa 
{
    private int codigo;
    private String nome;
    private float saldo;

    public programa(){}
    
    public programa(int codigo, String nome, float saldo)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar()
    {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Digite o codigo:"));
        this.nome = JOptionPane.showInputDialog(null, "Digite o nome:");
        this.saldo = Float.parseFloat(JOptionPane.showInputDialog(null, 
           "Digite o saldo:"));
    }
    
    public String listar()
    {
        return "Codigo: " +codigo+ "\nNome: " +nome+ "\nSaldo inicial: " +saldo;
    }
    
    public boolean deposito(float valor)
    {
        if(valor <= 0 ) return false;
        valor += saldo;
        return true;
        
    }
    
    public boolean saque(float valor)
    {
        if(valor <= 0 || valor > saldo ) return false;
        valor -= saldo; return true;
    }
}
