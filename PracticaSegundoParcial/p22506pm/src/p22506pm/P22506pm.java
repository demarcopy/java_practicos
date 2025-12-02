
package p22506pm;


public class P22506pm {


    public static void main(String[] args) {
        proceso();
        imprimirMatriz(proceso());
        
        
        
    }
    
    public static int[][] proceso (){
        int[][] matResultado = new int[7][4];
        ArchivoLectura arch = new ArchivoLectura("instrucciones.txt");
        ArchivoGrabacion grab = new ArchivoGrabacion("tejido.txt");
        
        
        while(arch.hayMasLineas()){
            if(arch.linea().charAt(0) != '@'){
                String[] codigo = arch.linea().split("#");
                String nuevaLinea = "";
                int tipoNum = 0;
                
                for(int i = 1; i < codigo.length; i = i+3){
                    int cantidad = Integer.parseInt(codigo[i]);
                    int color = Integer.parseInt(codigo[i+1]);
                    String tipo = codigo[i+2];
                
                    for(int j = 0; j < cantidad; j++){
                        nuevaLinea = nuevaLinea + tipo + color;
                    
                    }
                if(tipo.equals("A")){
                    tipoNum = 0;
                }
                if(tipo.equals("B")){
                    tipoNum = 1;
                }
                if(tipo.equals("C")){
                    tipoNum = 2;
                }
                if(tipo.equals("D")){
                    tipoNum = 3;
                }

                matResultado[color][tipoNum] += cantidad;                 
            }

            grab.grabarLinea(nuevaLinea);    
            }
        
        }
        
        
        
        arch.cerrar();
        grab.cerrar();
        return matResultado;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
    System.out.println("   A   B   C   D");
    for (int i = 0; i < matriz.length; i++) {
        System.out.print(i + ": ");
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.printf("%-4d", matriz[i][j]);
        }
        System.out.println();
    }
}

}
