
package Logica;

import java.io.Serializable;


public class csClienteFrecuente extends csAnuncio implements Serializable {
    private double desc_f;
   
    // Constructor

    public csClienteFrecuente(double desc_f, String titulo, String fecha, String seccion, String descripcion, int tot_caracteres, double costo, double IVA, double total) {
        super(titulo, fecha, seccion, descripcion, tot_caracteres, costo, IVA, total);
        this.desc_f = desc_f;
    }

    public csClienteFrecuente(double desc_f) {
        this.desc_f = desc_f;
    }

    public csClienteFrecuente(double desc_f, csTradicional csTradicional) {
        super(csTradicional);
        this.desc_f = desc_f;
    }
    
    
    

    public csClienteFrecuente() {
        super();
    }

    // getter setter
    
    public double getDesc_f() {
        return desc_f;
    }

    public void setDesc_f(double desc_f) {
        this.desc_f = desc_f;
    }
    
    // Método para calcular el costo según el descuento aplicado por el usuario
    
    public double descuento_cf () {
        double Ccosto = 0.0;
        Ccosto = this.costo(this.getSeccion());
        Ccosto = Ccosto - (Ccosto * (desc_f/100));
               
        return Ccosto + IVA(Ccosto);
    }
    
}
