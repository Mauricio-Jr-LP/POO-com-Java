/*            Cliente 
------------------------------------------- 
- codigo: int 
- nome:String 
- idade:int 
- sexo:char 
--------------------------------------------- 
+Cliente() 
+Cliente(int cod, String nome, int idade, char sexo) 
+ getters e setters*/

package Modell;

public class Cliente 
{
    private int codigo ;
    private String nome;
    private int idade;
    private char sexo;
    
    public Cliente(int codigo, String nome, int idade, char sexo)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public Cliente(){}

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}