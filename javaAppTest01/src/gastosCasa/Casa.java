
package gastosCasa;
import java.util.ArrayList;
import java.util.Comparator;


public class Casa {
    private ArrayList<Gasto> listaDeGastos;
    
    public ArrayList<Gasto> getListaDeGastos(){
        return listaDeGastos;
    }

    
    public void agregarGasto(Gasto gasto){
        this.getListaDeGastos().add(gasto);
    }
    
    public void agregarGasto(int dia, int monto, String descripcion){
        Gasto gasto = new Gasto(dia,monto,descripcion);
        this.getListaDeGastos().add(gasto);
    }
    
    public Gasto devolverGastoMayorManualTotalmente(){
        Gasto max = new Gasto();
        Gasto aux;
        for(int i = 0 ; i < this.getListaDeGastos().size(); i++){
            aux = this.getListaDeGastos().get(i);
            if(aux.getMonto() > max.getMonto()){
               max = aux;
            }
        }
        return max;

    }
    
    
    public Gasto devolverGastoMayorManual(){
        Gasto max = new Gasto();
        Gasto aux;
        Iterator<Gasto> it = this.getListaDeGastos().iterator();
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getMonto() < max.getMonto){
                max = aux;
            }
        }
        return max;
        
        
    }


    public double promedioDiarioP(){
        int gastos = 0;
        int resultado = 0;
        
        for(int i = 0; i < this.getListaDeGastos().size(); i++){
            Gasto aux = this.getListaDeGastos().get(i);            
            gastos += aux.getMonto();
        }
        resultado = gastos / 30;
    return resultado;
    }
    
    public int[] gastosPorDia(){
        int[] totales = new int[31];
        
        for(int i = 0; i < this.getListaDeGastos().size(); i++){
            Gasto aux = this.getListaDeGastos().get(i);
            int diaGasto = aux.getDia();
            totales[diaGasto] = aux.getMonto();
        }
    return totales;
    }
    

    public int diasSinGasto(){
    int[] dias = this.gastosPorDia();
    int cantidad = 0;

        for(int i = 1; i < dias.length; i++){
            if(dias[i] == 0){
                cantidad++;
            }
         
        }
    return cantidad;
    }
    
    public double promedioEntreDias(int desde,int hasta){
    int suma = 0;
    
    for(int i = desde; i < hasta; i++){
        suma += totalDiario[i];
    }

    return suma;
    }



    public int gastoMayorEnDia(int unDia){
    int resultado = 0;
    
    for(int i = 0; i < this.getListaDeGastos().size(); i++){
        Gasto gasto = this.getListaDeGastos().get(i);
        if(gasto.getDia()== unDia){
            if(gasto.getMonto() > resultado){
                resultado = gasto.getMonto();
            }    
        }
    }
    return resultado;       
    }
    

   
    public int[][] tablaGastosDias(){
    
    int[][] matrizResultado = new int[31][5];
    
    for(int z = 0; z < this.getListaDeGastos().size(); z++){
    Gasto gasto = this.getListaDeGastos().get(z);
    int fila = gasto.getDia();
    int monto = gasto.getMonto();
    
        for(int i = 0; i < matrizResultado.length; i++){
            for(int j = 0; j < matrizResultado[0].length; j++){
               
               int columna = monto / 500;
               if(columna >= 4){
                   columna = 4;
               }
               matrizResultado[fila][columna] ++;
            
            }
        
        }

    }
    return matrizResultado;
    } 
    
    
    
    
    public boolean diaConGasto(int unMonto){
    boolean existe = false;
    
    /*
    for (Gasto gasto : this.getListaDeGastos()) {
        if(gasto.getMonto() == unMonto){
            existe = true;
        }
    }
    */
    
    for(int i = 0; i < this.getListaDeGastos().size() && !existe; i++){
        Gasto gasto = this.getListaDeGastos.get(i);
        if(gasto.getMonto() == unMonto){
            existe = true;
        }
    
    }
    

    
    return existe;
    }
    
 
    public ArrayList<Gasto> ordenar(){
        Collections.sort(listaDeGastos, Comparator.comparing(Gasto::getMonto));
        return this.getListaDeGastos();
    
    }
    
    
    
    
    
    
}