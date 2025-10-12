package Banco;


public class CajaAhorro extends Cuenta{
    private static float Tasa = 0.12f;
    
    public CajaAhorro(double unMonto){
        this.depositar(unMonto);
    }
    
    public static void setTasa(float unaTasa){
        CajaAhorro.Tasa = unaTasa; 
    }
    
    public static float getTasa(){
        return CajaAhorro.Tasa;
    }
    
    public void acumularInteres(){
        double aux = this.getSaldo();
        aux = aux*CajaAhorro.getTasa/12;
        this.depositar(aux);
    }
}
