/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialanterior;

/**
 *
 * @author Administrador
 */
public class main {
    public static void main(String[]args){
        Sistema sistema = new Sistema();
        
  // ----- Emprendedores -----
        Emprendedor e1 = new Emprendedor("Ana Gómez", "Av. Italia 1234", "Montevideo");
        Emprendedor e2 = new Emprendedor("Luis Pereira", "18 de Julio 2660", "Montevideo");
        Emprendedor e3 = new Emprendedor("María Torres", "Río Negro 889", "Canelones");

        sistema.getListaEmprendedores().add(e1);
        sistema.getListaEmprendedores().add(e2);
        sistema.getListaEmprendedores().add(e3);

        // ----- Productos -----
        Producto p1 = new Producto(e1, "Velas Aromáticas", "Velas hechas a mano con aceites esenciales.");
        Producto p2 = new Producto(e1, "Jabón Natural", "Jabones artesanales sin químicos.");
        Producto p3 = new Producto(e2, "Cuadernos Eco", "Cuadernos reciclados con diseño personalizado.");
        Producto p4 = new Producto(e3, "Mermelada Casera", "Mermeladas orgánicas sin azúcar.");
        Producto p5 = new Producto(e3, "Pan de Campo", "Pan artesanal hecho en horno de barro.");

        sistema.getListaProductos().add(p1);
        sistema.getListaProductos().add(p2);
        sistema.getListaProductos().add(p3);
        sistema.getListaProductos().add(p4);
        sistema.getListaProductos().add(p5);        
        
        
        
        
        
        
        
        Ventana vent = new Ventana(sistema);
        vent.setVisible(true);
    
    }
}
