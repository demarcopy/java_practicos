package Contador;

import java.util.Set;
import java.util.Observable;

public class ModeloContador extends Observable {
    private int valor;
    
    public ModeloContador(int valor){
        this.setValor(valor);
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int unValor){
        this.valor = unValor;
        setChanged();
        notifyObservers();
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
