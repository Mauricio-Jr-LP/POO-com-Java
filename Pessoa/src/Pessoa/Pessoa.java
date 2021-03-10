package Pessoa;

import javax.swing.JOptionPane;

public abstract class Pessoa 
{
    
    /*Modificador abstract = Faz com que as classes percan o poder de 
    instanciameno e permite que em determinado momento você tenha metodos desse 
    tipo. Isso sera usado quando falarmos sobre herança. Ou seja, usando o 
    abstract, a classe tera como função apenas gerar novas classes e não novos
    objetos.
    
    Pode ser utilizado para classes e metodos.
    
    Na orientação a objetos, é permitido o conceito de Herança Multipla: 
    caracteristicas herdadas de dois ancestrais. O que é diferente da Herança 
    Simples, que so tem um ancestral.
    
    Java não permite herança multipla de classe.
    
    Superclasse/ancestral: classe superior/ aquela que provem da herança.
    Subclasse/descendente/classe derivada: recebe a herança.
    
    Como diferencila-las em um codigo?
    -Atraves do termo extends: define que você esta herdado de uma classe.
    Sintaxe: class NomeDaClasseFilho extends NomeDaClasseMae();
    
    Subclasse->SuperClasse.
    
    A herança é uma das principais caracteristicas que permite o reuso do codigo
    
    Modificador final = Se a classe tive o modificador final, este a impedira de
    gerar um herança. E se um metodo tiver esse modificador, esse não sera pas-
    sado para os "filhos".
    
    Polimorfismo: modificar um metodo para que este assuma uma nova empatia.
    */
    
    //Atributos:
    private String nome;
    private int codigo;

    //Metodos
    public Pessoa(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa() {} ;
        
        pessoa.setCodigo(10);
        pessoa.setNome("Fulano");
        
        JOptionPane.showMessageDialog(null, pessoa.getNome());
    }
    
}
