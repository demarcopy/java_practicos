
package claseJuegos;

class Fabricante {
    private String nombre;
    private String pais;

    //Constructor
    public Fabricante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + " (" + pais + ")";
    }
}

