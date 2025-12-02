/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialanterior;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Producto implements Comparable <Producto>{
    private Emprendedor emprendedor;
    private ArrayList<Opinion> listaOpiniones;
    private String nombre;
    private String descripcion;

    public Producto() {
        listaOpiniones = new ArrayList<>();
    }

    public Producto(Emprendedor emprendedor, String nombre, String descripcion) {
        this.emprendedor = emprendedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaOpiniones = new ArrayList<>();
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }

    public ArrayList<Opinion> getListaOpiniones() {
        return listaOpiniones;
    }

    public void setListaOpiniones(ArrayList<Opinion> listaOpiniones) {
        this.listaOpiniones = listaOpiniones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public int compareTo(Producto unP){
        return this.getNombre().compareTo(unP.getNombre());
    }
    
    @Override
    public String toString(){
        return this.getNombre() + "-" + this.getEmprendedor().getNombre();
    }
    
}
