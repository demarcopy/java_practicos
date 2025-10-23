
package claseCamion;

import java.util.Scanner;



public class POO {
    public static void main(String[]args){

    Camion c1 = new Camion ();
    c1.setModelo(2004);
    c1.setChapa("SAS1111");
    c1.setCarga(1000);
    //Metodo estatico
    Camion.setAnio (2012);
    
    if (c1.leTocaRevision()) {
    System.out.println("Al camion: "+c1+ " le toca revisión");
    }
    else {
    System.out.println("Al camion: "+c1+ " no le toca revisión");
    }
 
    }
}
