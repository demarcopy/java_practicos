
package p22412pn;


public class P22412pn {


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public static void proceso(){
        ArchivoLectura subidas = new ArchivoLectura("subidas");
        
        ArchivoLectura bajadas = new ArchivoLectura("bajadas");
        
        ArchivoGrabacion grab = new ArchivoGrabacion("problemas");
        
        boolean[] asientosConProblemas = new boolean[301];
    
        
        
        
        subidas.cerrar();
        bajadas.cerrar();
        grab.cerrar();
        
    }
    
    
}
