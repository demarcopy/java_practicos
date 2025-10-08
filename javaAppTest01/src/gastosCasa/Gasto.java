
package gastosCasa;


public class Gasto implements Comparable<Object>{
    private int dia;
    private int monto;
    private String descripcion;
    
    public Gasto(){
    
    
    }
    
    public Gasto(int unDia, int unMonto, String descripcion){
        this.dia = unDia;
        this.monto = unMonto;
        this.descripcion = descripcion;

        
    }
    
    public int getDia(){
       return monto;
    }  

    public int getMonto(){
        return dia;
    }  
 
    public String getDescripcion(){
        return descripcion;
    }  
    
    public void setDescripcion(String unaDescripcion){
        this.descripcion = unaDescripcion;
    }
    
    @Override
    public String toString(){
        return "Gasto" + this.getDia() + "$" + this.getMonto() + "de" + this.getDescripcion();
    }
    @Override
    public int compareTo(Object o){
        return this.getMonto() - ((Gasto) o).getMonto();
    
    }
    
}
