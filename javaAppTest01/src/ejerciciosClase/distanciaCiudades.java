
package ejerciciosClase;

public class distanciaCiudades {
    public static void main(String[] args){
    
    }
    
    public static int distanciaCiudades(int[][] mat, int desde, int hasta){
   /*Encontrar la forma de ir de una ciudad a otra, con minimo una escala.
    Total = T1 + T2
   */
   
    //[0,30,45,100]
    //[23,0,56,200]
    //[51,23,0,3000]
    //[430,320,12,0]
    
    int min = mat[desde][hasta];
    
    for(int i=0; i < mat.length; i++){
        if(i!= desde &&  i != hasta){
            int costo = mat[desde][i] + mat[i][hasta];
            if(costo<min){
                min=costo;
            }
            
        }
    }
        return 0;
        
  }
}
