
package testparcial;


public class TestParcial {

    public static void main(String[] args) {
      prueba();
      ArchivoGrabacion problemas1=  new ArchivoGrabacion("problemas1");
    }

    public static void prueba(){

        int[] valijasMalas= new int[301];
        int[] valijasBuenas= new int[301];
        int[] valijasRegulares= new int[301];
        ArchivoLectura subidas=new ArchivoLectura("subidas.txt");
        ArchivoLectura bajadas=new ArchivoLectura("bajadas.txt");
        ArchivoGrabacion problemas =  new ArchivoGrabacion("problemas");

        while(bajadas.hayMasLineas()) {

            int asiento=Integer.parseInt(bajadas.linea().split("#")[0]);
            String estadoValija=bajadas.linea().split("#")[1];
            String [] datos= new String[5];
            switch (estadoValija) {
                case "B" :  valijasBuenas[asiento]++;
                case "M" : valijasMalas[asiento]++;
                case "R" : valijasRegulares[asiento]++;
             }

        }
        while(subidas.hayMasLineas()) {
           String resultado="";
           int asiento=Integer.parseInt(subidas.linea().split("#")[0]);
           String strAsiento=(subidas.linea().split("#")[0]);
           int cantidadValijas=Integer.parseInt(subidas.linea().split("#")[1]);
           int noLlegaron = cantidadValijas-valijasBuenas[asiento]-valijasRegulares[asiento]-valijasMalas[asiento];
           resultado+= strAsiento+"#" + cantidadValijas+"#"+valijasBuenas[asiento]+"#"+valijasRegulares[asiento]+"#"+valijasMalas[asiento]+"#"+(noLlegaron);
           if(valijasRegulares[asiento] != 0 || valijasMalas[asiento]!=0  || noLlegaron!=0) {
               problemas.grabarLinea(resultado);
           }


        }
        subidas.cerrar();
        bajadas.cerrar();
        problemas.cerrar();


        }

}
    

