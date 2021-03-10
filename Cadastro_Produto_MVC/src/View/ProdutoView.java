/*devera ter um menu para:
1 cadastrar
2 listar
3 Entrada produto
4 saida produto
5 sair
*/

package View;
import Controll.ProdutoControll;
import Modell.Produto;
import javax.swing.JOptionPane;

public class ProdutoView 
{
    public static void main(String[] args)
    {
        ProdutoControll pc = new ProdutoControll();
        Produto produto = new Produto();
        
        int menu;
        float quant = 0;
        
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar\n2 - Listar"
                + "\n3 - Entrada de produto\n4 - Saída de produto \n5 - Sair"));
            
            switch(menu)
            {
                case 1: int codigo = Integer.parseInt
                (JOptionPane.showInputDialog(null, "Código do produto"));
                String nome = JOptionPane.showInputDialog(null,
                    "Nome do produto");
                float quantidade = Float.parseFloat(JOptionPane.showInputDialog
                    (null, "Quatidade do produto"));
                float preço = Float.parseFloat(JOptionPane.showInputDialog
                    (null, "Preço do produto"));
                
                produto.setCodigo(codigo);
                produto.setNome(nome);
                produto.setQuantidade(quantidade);
                produto.setPreço(preço);
                pc.cadastrar(produto);
                
                JOptionPane.showMessageDialog(null, "Produto cadastrado");
                break;
                
                case 2: 
                    produto = pc.listar();
                    JOptionPane.showMessageDialog(null, 
                        "Codigo: "+produto.getCodigo()+
                        "\nNome: "+produto.getNome()+
                        "\nQuantiade: "+produto.getQuantidade()+
                        "\nPreço: "+produto.getPreço());
                break;
                
                case 3: 
                    quant = Float.parseFloat(JOptionPane.showInputDialog(null, 
                        "Entrada:"));
                    
                    if(pc.entrada(quant))
                        JOptionPane.showMessageDialog(null, 
                            "Entrada realizada com sucesso");
                    else 
                        JOptionPane.showMessageDialog(null, 
                            "Erro ao dar entrada");
                break;
                
                case 4:
                    quant = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Digite a saida: "));
                    if(pc.saida(quant))
                       JOptionPane.showMessageDialog(null, "Saida com sucesso");
                    else
                       JOptionPane.showMessageDialog(null, "Erro ao dar saida");
                break;
                
                case 5:JOptionPane.showMessageDialog(null, "Saida com sucesso");
                break;
                default:JOptionPane.showMessageDialog(null, "Comando invalido");
                break;
            }
        }while(menu!=5);
    }
    
}
