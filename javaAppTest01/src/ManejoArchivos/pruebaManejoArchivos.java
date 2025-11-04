
package ManejoArchivos;

import java.io.IOException;


public class pruebaManejoArchivos {
    public static void main(String[]args) throws IOException{
        
        /*
        ArchivoLectura arch = new ArchivoLectura("Archivo_test");
        while(arch.hayMasLineas()){
            System.out.println(arch.linea());
        }
        arch.cerrar();
        */
        
        //listarn("Archivo_test.txt", 2);
        
        //eliminarComentarios("Archivo_test.txt","nuevoArchivo");
        
        numerosQuiniela("quiniela.txt");
                
    }
    
    public static void listarn(String nombre, int n){
        ArchivoLectura arch = new ArchivoLectura(nombre);
        int van = 0;
        while(arch.hayMasLineas()){
            System.out.println(arch.linea());
            van++;
            if(van%n==0){
                System.out.println(" ");
            }
        }
        arch.cerrar(); 
    }
    
    public static void eliminarComentarios(String nombre, String nuevo){
        ArchivoLectura arch = new ArchivoLectura(nombre); 
        ArchivoGrabacion salida = new ArchivoGrabacion(nuevo);
        
        while(arch.hayMasLineas()){
            String linea = arch.linea();      
            if(!linea.substring(0,2).equals("//")){
                salida.grabarLinea(linea);
            }        
        }
        arch.cerrar(); 
    }
    
    public static int robotMouse(String nombre){
        ArchivoLectura arch = new ArchivoLectura(nombre);
        int resultado = 0;
        while(arch.hayMasLineas()){
            boolean recorridoDerecha = true;
            int numero = Integer.parseInt(arch.linea());
            if(numero==-1){
                recorridoDerecha = false;
            }else if(numero==-2){
                recorridoDerecha = true;
            }
            
            if(recorridoDerecha){
                resultado = resultado + numero;
            }else{
                resultado = resultado - numero;
            }     
        }
        arch.cerrar();
        return resultado;
    }

    public static void numerosQuiniela(String nombre){
        ArchivoLectura arch = new ArchivoLectura(nombre);
        boolean[] res = new boolean[10];
        while(arch.hayMasLineas()){
            int numero = Integer.parseInt(arch.linea());
            res[numero] = true;
        }
        
        for(int i = 0; i < res.length; i++){
            if(!res[i]){
                System.out.println("numero quiniela" + i + "\n");
                        
            }
        }
        arch.cerrar();
    
    }
    
}
