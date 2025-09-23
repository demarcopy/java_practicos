
package claseCamion;
import java.util.*;

public class Empresa {
    private String nombre;
    private ArrayList<Camion> listaCamiones;
    
    public Camion() {
    }

    
    public arrayList<Camion> getListaCamiones(){
        this.nombre = nombre;
    }
    public Camion(String chapa, int carga, String color) {
        this.chapa = chapa;
        this.carga = carga;
        this.color = color;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarCamion(Camion c){
        this.getListaCamiones().add(c);
    }
    
    public ArrayList<Camion> camionesCargaMaxima(){
        int max = 0;
        ArrayList<Camion> lista = new ArrayList<>();
        for(Camion c : this.getListaCamiones()){
            if(c.getCarga() > max){
                max=c.getCarga();
                lista = new ArrayList<>();
                lista.add(c);
                
            }
        }
    }
    
    
    
}
