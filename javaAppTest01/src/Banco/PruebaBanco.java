/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Rodrigo
 */
public class PruebaBanco {
    public static void main(String[] args){
        CajaAhorro ca = new CajaAhorro(200);
        ca.setNombre("CA Pepe");
        ca.depositar(100);
        
        System.out.println(ca);
        
        ca.acumularInteres();
        
        System.out.println("Luego de acumular" + ca);
        
        if(ca.retirar(1000)){
            System.out.print("Retiro ok");
        }else{
            System.out.println("Retiro no ok");
        }
    
    }
}
