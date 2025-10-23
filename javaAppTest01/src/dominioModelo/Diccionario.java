
package dominioModelo;
import java.util.HashMap;
import java.util.Iterator;

public class Diccionario {
    private HashMap<String,String> diccionario;
    
    public Diccionario(){
        this.diccionario = new HashMap<>();
    }
    
    public HashMap<String, String> getDiccionario(){
        return diccionario;
    }
    
    public void agregarEntrada(String palabra, String traduccion){
        this.getDiccionario().put(palabra,traduccion); //Si tiene la clave la actualiza, si no la tiene la agrega.
    
    }
    
    public void eliminarEntrada(String palabra){
        this.getDiccionario().remove(palabra);
    }
    
    public String datTraduccion(String palabra){
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
            if(traduccion.equals(this.getDiccionario().get(clave))){
               encontre = true;
               clave = claveAux;
            }
        }
        return clave;       
    }
    
}
