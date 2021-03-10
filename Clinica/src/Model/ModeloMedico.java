package Model;

import Control.ControleMedico;
import java.util.ArrayList;


public class ModeloMedico 
{
    private int codigo;
    private int crm;
    private String nome;
    private String especialidade;
    private float receita;
    public ArrayList<ControleMedico> String;
    
    public ModeloMedico(int crm, String nome, String especialidade, 
        int codigo, float receita) 
    {
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.receita = receita;
    }

public ModeloMedico(){}

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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getReceita() {
        return receita;
    }

    public void setReceita(float receita) {
        this.receita = receita;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ModeloMedico{" + "codigo=" + codigo + ", crm=" + crm + ", nome=" + nome + ", especialidade=" + especialidade + ", receita=" + receita + ", String=" + String + '}';
    }
    
}
