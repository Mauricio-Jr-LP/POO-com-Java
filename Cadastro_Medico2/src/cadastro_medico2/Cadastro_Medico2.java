/*Seguindo esse exemplo criar um sistema para cadastrar medico:
crm (inteiro), nome (string), especialização (string), investimento (float)
cadastrar(): void, listar():string, consulta(float valor):boolean, impostos
(float valor):boolean
cada consulta cadastrada aumenta o investimento, cada imposto pago reduz o 
investimento.*/

package cadastro_medico2;

import javax.swing.JOptionPane;

public class Cadastro_Medico2 
{
    private int crm;
    private String nome;
    private String especializacao;
    private float investimento;
    
    public Cadastro_Medico2(){}
    
    public Cadastro_Medico2(int crm, String nome, String especializacao, 
        float investimento)
    {
        this.crm = crm;
        this.nome = nome;
        this.especializacao = especializacao;
        this.investimento = investimento;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }
    
    public void cadastrar(int crm, String nome, String especializacao, 
        float investimento)
    {
        this.nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        this.crm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "
            + "crm: "));
        this.especializacao = JOptionPane.showInputDialog(null, "Digite a "
            + "especialização: ");
        this.investimento = Float.parseFloat(JOptionPane.showInputDialog(null, 
            "Digite o investimento: "));
    }
    
    public String listar()
    {
        return "CRM:\n" +crm+ "\nNome:\n" +nome+ "\nEspecialização:\n" +especializacao+
        "\nInvestimento:\nR$" +investimento;
    }
    
    public boolean consutas(float valor)
    {
        valor += investimento;
        return true;
    }
    public boolean impostos(float valor)
    {
        valor -= investimento;
        return false;
    }
}