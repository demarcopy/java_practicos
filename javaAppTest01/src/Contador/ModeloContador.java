package Contador;

import java.util.Set;

public class ModeloContador {
    private int valor;
    
    public ModeloContador(int valor){
        this.setValor(valor);
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int unValor){
        this.valor = unValor;
    }

    @Override
    public String toString() {
        return "" + this.getValor();
    }
    
    public void incrementar(){
        this.setValor(this.getValor()+1);
    }
    
    public void decrementar(){
        this.setValor(this.getValor()-1);
    }
    
    public void setearValor(int valor){
        this.setValor(valor);
    }
    
    
    public void resetear(){
        this.setValor(0);        
    }
    
    
}
