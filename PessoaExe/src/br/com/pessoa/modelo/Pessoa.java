
package br.com.pessoa.modelo;

public class Pessoa {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cod: "+getCodigo()+" - Nome: "+getNome()+" - Email: "
                +getEmail()+" - Tel: "+getTelefone();
    }
    
    
}
