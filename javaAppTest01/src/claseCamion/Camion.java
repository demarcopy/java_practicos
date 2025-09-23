package claseCamion;

class Camion {
    private String chapa;
    private int carga;
    private String color;
    private static int anio;


    // Constructor vacío (opcional)
    public Camion() {
    }

    // Constructor con parámetros (opcional)
    public Camion(String chapa, int carga, String color) {
        this.chapa = chapa;
        this.carga = carga;
        this.color = color;
    }

    
    public static int getAnio(){
        return anio;
    }  
    
    public static void setAnio(int unAnio){
        anio = unAnio;
    }
    
    
    // Getters
    public String getChapa() {
        return chapa;
    }

    public int getCarga() {
        return carga;
    }

    public String getColor(){
        return this.color;
    }
  
    
// Setters
    public void setChapa(String unaChapa) {
        this.chapa = unaChapa;
    }

    public void setCarga(int unaCarga) {
        this.carga = unaCarga;
    }

    public void setColor(String unColor){
        this.color = unColor;
    }

    
    
    // Método de comparación
    public boolean tieneIgualCargaQue(Camion unCamion) {
        return this.carga == unCamion.getCarga();
    }

    // toString sobreescrito
    @Override
    public String toString() {
        return "Camion con chapa " + this.chapa + " y carga " + this.carga;
    }
}