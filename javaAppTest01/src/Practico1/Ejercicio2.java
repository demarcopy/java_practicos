
package Practico1;

//2) Dadas las variables booleanas w = false, x = true, y = true, z = false, determinar el valor de las
//siguientes expresiones lógicas:

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean w = false;
        boolean x = true;
        boolean y = true;
        boolean z = false;
        
        //1
        System.out.println(w || y && x && w || z );       
        
        //2
        System.out.println(x && !y && !x || !w && y);
        
        //3
        System.out.println(!(w || !y) && x || z);
        
        //4
        System.out.println(x && y && w || z || x);
        
        //5
        System.out.println(y || !(y || z && w));
        
        //6
        System.out.println(!x && y && (!z || !x));
        
    }
}
