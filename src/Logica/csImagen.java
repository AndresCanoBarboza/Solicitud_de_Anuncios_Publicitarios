
package Logica;

import java.io.Serializable;


public class csImagen extends csAnuncio implements Serializable {
    
    private int mm;
    private double total_i;
    // Constructor

    public csImagen(int mm, double total_i, String titulo, String fecha, String seccion, String descripcion, int tot_caracteres, double costo, double IVA, double total) {
        super(titulo, fecha, seccion, descripcion, tot_caracteres, costo, IVA, total);
        this.mm = mm;
        this.total_i = total_i;
    }

    public csImagen(int mm, double total_i) {
        this.mm = mm;
        this.total_i = total_i;
    }

    public csImagen(int mm, double total_i, csTradicional csTradicional) {
        super(csTradicional);
        this.mm = mm;
        this.total_i = total_i;
    }

    
    
   

    

    public csImagen() {
        super();
    }

    // getter setter
    
    public double getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }
    public double getTotal_i() {
          return total_i;
      }

    public void setTotal_i(double total_i) {
        this.total_i = total_i;
    }
    
    // método para calcular el costo según tamaño de la imagen
    //mm es enviado por el usuario y se calcula al final el iva
    
    public double imagen() {
        double Ccosto = 0.0;
        Ccosto = this.costo(this.getSeccion());
        int extra = mm * 25;
        Ccosto = extra + Ccosto;
        total_i = Ccosto;
        
    return total_i + IVA(total_i);  
        
    }
    
}
