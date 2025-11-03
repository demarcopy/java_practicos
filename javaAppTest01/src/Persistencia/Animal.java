
package Persistencia;

import java.io.Serializable;


public class Animal implements Serializable {
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
