
package claseCamion;

import java.util.Scanner;



public class POO {
    public static void main(String[]args){
        Camion c1 = new Camion();
        c1.setChapa("");
        c1.setCarga(1000);
        
        Camion c2 = new Camion();
        c2.setChapa("");
        c2.setCarga(2000);
        
        Camion c3 = new Camion("HDB230", 200,"Rojo");
        
        Camion c4 = new Camion();
        c4.setCarga(200);
        
        
        System.out.println("Camion c1 tiene chapa:" + c1.getChapa());
    }
}
