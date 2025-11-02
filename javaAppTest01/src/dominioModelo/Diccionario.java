
package dominioModelo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;

public class Diccionario extends Observable{
    private HashMap<String,String> diccionario;
    
    public Diccionario(){
        this.diccionario = new HashMap<>();
    }
    
    public HashMap<String, String> getDiccionario(){
        return diccionario;
    }
    
    public void agregarEntrada(String palabra, String traduccion){
        this.getDiccionario().put(palabra,traduccion); //Si tiene la clave la actualiza, si no la tiene la agrega.
        setChanged();
        notifyObservers();
    
    }
    
    public void eliminarEntrada(String palabra){
        this.getDiccionario().remove(palabra);
    }
    
    public String darTraduccion(String palabra){
        return this.getDiccionario().get(palabra);
    }
    
    public String[] obtenerClaves() {
        return this.getDiccionario().keySet().toArray(new String[this.getDiccionario().size()]);
    }
    
    public String[] obtenerTraducciones() {
        return this.getDiccionario().values().toArray(new String[this.getDiccionario().size()]);
    }
    
    public String ubicarClave(String traduccion){
        boolean encontre = false;
        String clave = "";
        Iterator<String> it = this.getDiccionario().keySet().iterator();
        while(it.hasNext() && !encontre){
            String claveAux = it.next();
            if(this.getDiccionario().get(claveAux).equals(traduccion)){
               encontre = true;
               clave = claveAux;
            }
        }
        return clave;       
    }
    
}
