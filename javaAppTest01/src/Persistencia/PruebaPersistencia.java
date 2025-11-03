/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Administrador
 */
public class PruebaPersistencia {
    public static void main(String[] args){
        Persona p1 = new Persona("Santi");
        Persona p2 = new Persona("Ana");
        Animal animal = new Animal();
        
        p1.setAnimal(animal);
        p2.setAnimal(animal);
        
        System.out.println("----------------");
        System.out.println("Primera persona original:" + p1);
        System.out.println("Primera persona original:" + p2);
        
        
        System.out.println("----------------");

        
             
        
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(p1);
            out.writeObject(p2);
        }catch(IOException e){     
            e.printStackTrace();    
        }

    }
}
