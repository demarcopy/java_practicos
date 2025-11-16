
package ManejoArchivos;

import java.io.IOException;
import java.util.StringTokenizer;


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
 
    public static void oracionesTautograma(String archivo){
        ArchivoLectura arch = new ArchivoLectura(archivo);
        ArchivoGrabacion salida = new ArchivoGrabacion("tautologia.txt");
        
        while(arch.hayMasLineas()){
            if(esTautograma(arch.linea())){
                salida.grabarLinea("T" + " " + arch.linea());         
            }
        
        }
    
    }
    
    public static boolean esTautograma(String unaLinea){
        boolean resultado = true;
        String[] listaPalabras = unaLinea.split(" ");
        char letra = listaPalabras[0].charAt(0);
      
            for(int i = 0; i < listaPalabras.length && true; i++){
                if(letra != listaPalabras[i].charAt(0)){
                    resultado = false;               
                }                         
            }
        
        return resultado;
    }
       

    
    public static void notaAlumnos(String respuestas, String salida, String alumnos){
        ArchivoLectura arch = new ArchivoLectura(respuestas);
        ArchivoLectura archAlumnos = new ArchivoLectura(alumnos);        
        
        ArchivoGrabacion sal = new ArchivoGrabacion(salida);
        
        int [] respOk = new int[20];
        int ind = 0;
        
        while(archAlumnos.hayMasLineas()){
            respOk[ind] = Integer.parseInt(arch.linea());
            ind++;    
        }
        
        int[] notas = new int[21];
        while(archAlumnos.hayMasLineas()){
            int valorNota = 0;
            for(int i = 0 ; i < 20; i++){
                archAlumnos.hayMasLineas();
                int opc = Integer.parseInt(archAlumnos.linea());
                if(respOk[ind] == opc){
                    valorNota++;
                }           
            }
        notas[valorNota]++;
        }
        arch.cerrar();
        archAlumnos.cerrar();
        
        for(int j = 0; j < 20; j++){
            System.out.println("Nota + " + j + notas[j]);
        }
    
    }
    
    public static void farmacia(String sucursalUno, String sucursalDos){
    // suc1.txt - productos que vendio sucursal 1 de farmacia
    /*
        Aspirina
        Aspirina
        Jarabe 
    */
     // suc2.txt - productos que vendio sucursal 1 de farmacia
    /*
        Aspirina
        Aspirina
        Crema
        Crema
        Zolben
    */   
    
        ArchivoLectura arch1 = new ArchivoLectura(sucursalUno);
        ArchivoLectura arch2 = new ArchivoLectura(sucursalDos);        
    
    
    }
    
    
    
}
