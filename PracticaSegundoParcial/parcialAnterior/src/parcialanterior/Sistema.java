
package parcialanterior;
import java.util.ArrayList;

public class Sistema {




    private ArrayList<Emprendedor> listaEmprendedores;
    private ArrayList<Producto> listaProductos;

    public Sistema() {
        listaEmprendedores = new ArrayList<>();
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Emprendedor> getListaEmprendedores() {
        return listaEmprendedores;
    }

    public void setListaEmprendedores(ArrayList<Emprendedor> listaEmprendedores) {
        this.listaEmprendedores = listaEmprendedores;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int promedioOpinionProducto(Producto unP){
        
        ArrayList<Opinion> listaOpiniones = unP.getListaOpiniones();
        int suma = 0;
        int cant = 0;
        int promedio = 0;
        
        for(Opinion opinion : listaOpiniones){
            suma = suma + opinion.getValor();
            cant ++;
        
        }
        promedio = suma / cant;
        return promedio;
    }
    
    public int promedioGeneral(){
        int suma = 0;
        int cant = 0;
        int promedio = 0;
        
        for(Producto prod : this.getListaProductos()){
            for(Opinion opinion : prod.getListaOpiniones()){
                suma = suma + opinion.getValor();
                cant++;
                        
            }
        }
        promedio = suma / cant;
        return promedio;
    }
    
    public boolean promedioMayor(Producto unP){
        int promProducto = promedioOpinionProducto(unP);
        int promedioGeneral = promedioGeneral();
        boolean promedioMayor;
        if(promProducto > promedioGeneral){
            promedioMayor = true;
        }else{
            promedioMayor = false;
        }
        return promedioMayor;
    }
    
}
