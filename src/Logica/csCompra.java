
package Logica;

import java.io.Serializable;


public class csCompra implements Serializable {
    
    private csAnuncio anuncio;

    
    //Constructor
    
    public csCompra(csAnuncio anuncio) {
        this.anuncio = anuncio;
    }

    // Getter and Setter
    
    public csAnuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(csAnuncio anuncio) {
        this.anuncio = anuncio;
    }
    
    
    
    
}
