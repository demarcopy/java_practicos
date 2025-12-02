/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialanterior;

/**
 *
 * @author Administrador
 */
public class Opinion {
    private Producto producto;
    private String comentario;
    private int valor; // entre 1 y 10

    public Opinion() {
    }

    public Opinion(Producto producto, String comentario, int valor) {
        this.producto = producto;
        this.comentario = comentario;
        this.valor = valor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }    
}
