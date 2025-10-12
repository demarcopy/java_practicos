
package Banco;


public class Cuenta implements Comparable<Object>{
    private String nombre;
    private double saldo;

    
   @Override
   public void depositar(double unMonto){
   
   
   }
   public boolean retirar(double unMonto){
       boolean ok = false;
       if(this.getSaldo >= unMonto){
           ok = true;
           this.setSalgo(this.getSaldo() - unMonto);
       }
   
   }
   
    @Override
    public int compareTo(Object o){
        return (int)this.getSaldo() - ((Cuenta) o).getSaldo();
    }
}
