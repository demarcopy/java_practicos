
package Excepciones;

public class Throwtest{
    public static void main(String argv[]) {
        int i;
        try { i = Integer.parseInt(argv[0]); }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Debe especificar un entero");
            return;
            }
            catch (NumberFormatException e) {
                System.out.println("Debe especificar un número");
        return;
    }
   
 
    
}
