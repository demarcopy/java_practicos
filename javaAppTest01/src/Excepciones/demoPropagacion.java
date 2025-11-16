/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Rodrigo
 */
public class demoPropagacion {
    public static void main(String[]args){
        nivel1();
        
    }
    public void nivel3(int ajuste){
        int current = 1;
        System.out.println("Inicio nivel 3");
        current = current/ajuste;
        System.out.println("Fin nivel 3");  
    }
    
    public void nivel2(){
        System.out.println("Inicio nivel 2");
        this.nivel3(0);
        System.out.println("Fin nivel 2");  
    }    
    
    public void nivel1(int ajuste){
        System.out.println("Inicio nivel 1");
        try{
            this.nivel2();
        }catch(ArithmeticException  e){ 
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Fin nivel 1");  
    }    
    
    
}
