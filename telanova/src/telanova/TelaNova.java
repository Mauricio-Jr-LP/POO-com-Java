package telanova;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaNova extends Janela
{   
    //JFrame = classe que permite criar janelas.
    
    public TelaNova(){}
    
    public void voz()
    {
        JOptionPane.showMessageDialog(null, "Rouca");
    }
    
    public static void main(String [] args)
    {
        TelaNova tela = new TelaNova();
        tela.voz();
    }
}
