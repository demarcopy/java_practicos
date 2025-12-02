
package p22506pn;


public class main {
    public static void main(String[]args){
         
        Sistema modelo = new Sistema();
        
        Categoria c1 = new Categoria();
        c1.setNombre("Playas");
        c1.setDescripcion("Fotos tomadas en playas uruguayas");

        Categoria c2 = new Categoria();
        c2.setNombre("Espacios públicos");
        c2.setDescripcion("Plazas, parques y espacios urbanos");

        modelo.getListaCategorias().add(c1);
        modelo.getListaCategorias().add(c2);    


        Participante p1 = new Participante();
        p1.setNombre("Ana López");
        p1.setCedula("4.567.123-4");
        p1.setCelular("091234567");
        p1.setDepartamento(1);

        Participante p2 = new Participante();
        p2.setNombre("Mario Pérez");
        p2.setCedula("3.789.222-1");
        p2.setCelular("098765432");
        p2.setDepartamento(10);

        modelo.getListaParticipantes().add(p1);
        modelo.getListaParticipantes().add(p2);
        
        Juez j1 = new Juez();
        j1.setNombre("Juez Martín");
        j1.setMail("martin@jueces.com");

        Juez j2 = new Juez();
        j2.setNombre("Jueza Laura");
        j2.setMail("laura@jueces.com");

        modelo.getListaJueces().add(j1);
        modelo.getListaJueces().add(j2);
        
        
        Foto f1 = new Foto();
        f1.setParticipante(p1);
        f1.setCategoria(c1);
        f1.setRuta("fotos/playa1.jpg");
        f1.setDescripcion("Atardecer en Punta del Este");

        Foto f2 = new Foto();
        f2.setParticipante(p2);
        f2.setCategoria(c2);
        f2.setRuta("fotos/ciudad1.jpg");
        f2.setDescripcion("Parque Rodó un domingo de tarde");

        modelo.getListaFotos().add(f1);
        modelo.getListaFotos().add(f2);
        
        Validacion v1 = new Validacion();
        v1.setFoto(f1);
        v1.setJuez(j1);
        v1.setTexto("Muy buena iluminación");

        Validacion v2 = new Validacion();
        v2.setFoto(f2);
        v2.setJuez(j2);
        v2.setTexto("Excelente composición");

        modelo.getListaValidaciones().add(v1);
        modelo.getListaValidaciones().add(v2);
    

    
    Ventana vent = new Ventana(modelo);
    
    vent.setVisible(true);
        
        
        
    }
    
    

}
