package Control;

/*import static Control.ControleMedico.Listar;*/
import Model.ModeloMedico;
import java.util.ArrayList;


public class ControleMedico 
{
    ModeloMedico mod = new ModeloMedico();
    ArrayList<ModeloMedico> base = new ArrayList<>();
    
    public void salvar(ModeloMedico mod)
    {
       
        this.mod = mod;
    }
    
    public boolean novo(ModeloMedico mod)
    {
        return base.add(mod);
    }
    
    /*public static  String Listar(ModeloMedico mod)
    {
    
    }
    
    public ArrayList<ModeloMedico> Lista()
    {
    return Listar;
    }*/
}
