package claseCamion;
import java.util.ArrayList;

public class pruebaArrayList {
    public static void main(String[] args) {
        Camion c1 = new Camion();
        c1.setChapa("");
        c1.setCarga(1000);

        Camion c2 = new Camion();
        c2.setChapa("");
        c2.setCarga(2000);

        Camion c3 = new Camion("HDB230", 200,"Rojo");

        Camion c4 = new Camion();
        c4.setCarga(200);

        ArrayList<Camion> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        
        System.out.println(lista.size()); // ejemplo de uso
        
        int camionesRojos = 0;
        
        //Iteracion1
        for(int i = 0; i < lista.size() ; i++){
            System.out.println(lista.get(i));
            if(lista.get(i).getColor().equals("Rojo")){
                camionesRojos++;
            }
        }
        
        //Iteracion 2
        for(Camion elem : lista){
            System.out.println(elem.getChapa());
        }
        
        //Iteracion 3
        int pos = 0;
        while(pos < lista.size()){
            System.out.println(lista.get(pos));
            pos++;
        }
    }
    
    
    @Override
    public boolean equals(Object o){
        return this.getChapa().equals( ((Camion) o).getChapa());
    }
    
    
}
