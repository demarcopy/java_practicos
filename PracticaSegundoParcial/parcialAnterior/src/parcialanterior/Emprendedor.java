/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialanterior;

/**
 *
 * @author Administrador
 */
public class Emprendedor {
    private String nombre;
    private String direccion;
    private String departamento;

    public Emprendedor() {
    }

    public Emprendedor(String nombre, String direccion, String departamento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
