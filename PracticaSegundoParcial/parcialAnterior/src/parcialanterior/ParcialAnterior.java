
package parcialanterior;


public class ParcialAnterior {


    public static void main(String[] args) {
        proceso();
    }
    
    
    public static void proceso(){
        ArchivoLectura arch = new ArchivoLectura("Datos.txt");
        ArchivoGrabacion grab = new ArchivoGrabacion("Subida.txt");
        int[][] matResultado = new int[9][19];
        
        while(arch.hayMasLineas()){
            String estudiante = arch.linea().split("#")[0];
            int nivel = Integer.parseInt(arch.linea().split("#")[1]);
            int edad = Integer.parseInt(arch.linea().split("#")[2]);
            String primeraVez = arch.linea().split("#")[3]; 
        
            if(primeraVez.equals("S")){
                matResultado[nivel][edad]++;           
            }
        }
        
        for(int i = 0; i < matResultado.length; i++){
            String lineaGrabar =  "Nivel: " + i;
            for(int j = 8; j < matResultado[0].length; j++){
                lineaGrabar = lineaGrabar + "Edad: " + j +" " + matResultado[i][j] + " ";    
            }
            grab.grabarLinea(lineaGrabar);

        
        }
        arch.cerrar();
        grab.cerrar();
    }
}
