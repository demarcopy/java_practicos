
package Banco;
import java.util.ArrayList;

public class CtaCte extends Cuenta {
    private ArrayList<String> listaCheques;
    
    public CtaCte(){
        this.listaCheques = new ArrayList<>();
    }
    
    public ArrayList<String> getListaCheques(){
        return listaCheques;
    }
    
    private void agregarCheque(String concepto){
        this.getListaCheques().add(concepto);
        
    }
        
    
    public boolean emitirCheque(double unMonto, String concepto){
        boolean ok = false;
        if(this.retirar(unMonto)){
            ok = true;
            this.agregarCheque(concepto);
        }
    return ok;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Lista de cheques" + this.getListaCheques();
    }
    
}
