/*Faça um promagrama em java para movimentar um produto:
-------------------------------------------------------------------------------
                             produto                                   
-------------------------------------------------------------------------------
-codigo: int            // - atributos privados
-nome: String           // + public
-Quantidade: float      //#
-preço: float
-------------------------------------------------------------------------------
+cadastrar(); void
- listar():String
+entrada(quantidade;float):boolean
+saida(quantidade;float);boolean
-------------------------------------------------------------------------------
*construtor
*Getter e Setter
*devera criar uma classe para executar o programa
*devera ter um menu para:
1 cadastrar
2 listar
3 Entrada produto
4 saida produto
5 sair
*nao podera dar saida com quantidade <=0*/ 

package Modell;

public class Produto 
{
    private int codigo;
    private String nome;
    private float quantidade;
    private float preço;
    
    public Produto(int codigo, String nome, float quantidade, float preço)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public Produto() {}

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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
}
