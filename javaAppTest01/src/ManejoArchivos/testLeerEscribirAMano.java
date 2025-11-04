/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoArchivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class testLeerEscribirAMano {
    
    public static void escribir(){
        try{
            Formatter arch = new Formatter("Archivo_Test.txt");
            arch.format("%s%n", "Rodrigo,test,prueba");
            arch.close();
        }catch(FileNotFoundException e){
            System.out.println("Error, no existe el archivo");
        }
    
    }
    
    
    public static void leerArchivo(){
        try{
        Scanner arch = new Scanner(Paths.get("Archivo_Test.txt"));
        while(arch.hasNext()){
            System.out.println("Contenido " + arch.nextLine());
        }
        arch.close();
        }catch(IOException e){
            System.out.println("Error");
        } 
    
    }

    
}
