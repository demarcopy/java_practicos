
package p22506pn;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Categoria> listaCategorias; 
    private ArrayList<Participante> listaParticipantes; 
    private ArrayList<Juez> listaJueces; 
    private ArrayList<Validacion> listaValidaciones; 
    private ArrayList<Foto> listaFotos;     

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public Sistema(){
        listaCategorias = new ArrayList<>();
        listaParticipantes = new ArrayList<>();
        listaJueces = new ArrayList<>();
        listaValidaciones = new ArrayList<>();
        listaFotos = new ArrayList<>();    
    }
    
    public Sistema(ArrayList<Categoria> listaCategorias, ArrayList<Participante> listaParticipantes, ArrayList<Juez> listaJueces, ArrayList<Validacion> listaValidaciones, ArrayList<Foto> listaFotos) {
        this.listaCategorias = listaCategorias;
        this.listaParticipantes = listaParticipantes;
        this.listaJueces = listaJueces;
        this.listaValidaciones = listaValidaciones;
        this.listaFotos = listaFotos;
    }

    public void setListaParticipante(ArrayList<Participante> listaParticipante) {
        this.listaParticipantes = listaParticipante;
    }

    public ArrayList<Juez> getListaJueces() {
        return listaJueces;
    }

    public void setListaJueces(ArrayList<Juez> listaJueces) {
        this.listaJueces = listaJueces;
    }

    public ArrayList<Validacion> getListaValidaciones() {
        return listaValidaciones;
    }

    public void setListaValidaciones(ArrayList<Validacion> listaValidaciones) {
        this.listaValidaciones = listaValidaciones;
    }

    public ArrayList<Foto> getListaFotos() {
        return listaFotos;
    }

    public void setListaFotos(ArrayList<Foto> listaFotos) {
        this.listaFotos = listaFotos;
    }
    
    public boolean validacionFotoYaExiste(Foto unaFoto){
        boolean existe = true;
        for(Validacion validacion : listaValidaciones){
            if(validacion.getFoto().equals(unaFoto)){
                existe = true;
            }
        }
        return existe;
    }
    
    public Validacion validacionDeFoto(Foto unaFoto){
        Validacion validacionFoto = new Validacion();
        for(Validacion validacion : listaValidaciones){
            if(validacion.getFoto().equals(unaFoto)){
                validacionFoto = validacion;
            }
        }       
        return validacionFoto;
    }
    
}
