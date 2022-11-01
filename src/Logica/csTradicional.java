
package Logica;

import java.io.Serializable;


public class csTradicional extends csAnuncio implements Serializable{ // Clase nueva sobre anuncio tradicional esta aplica descuento seg[un cantidad de caracteres o calcula sin descuento seg[un sea seleccionado
   
    private double descuento;
    private double total_f;

   
    
    // Constructor

    public csTradicional(double descuento, double total_f, String titulo, String fecha, String seccion, String descripcion, int tot_caracteres, double costo, double IVA, double total) {
        super(titulo, fecha, seccion, descripcion, tot_caracteres, costo, IVA, total);
        this.descuento = descuento;
        this.total_f = total_f;
    }

    public csTradicional(double descuento, double total_f) {
        this.descuento = descuento;
        this.total_f = total_f;
    }

    public csTradicional(double descuento, double total_f, csTradicional csTradicional) {
        super(csTradicional);
        this.descuento = descuento;
        this.total_f = total_f;
    }
    
    
    public csTradicional() {
        super();
    }

    public csTradicional(csTradicional tradi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // setter getter

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

     public double getTotal_f() {
        return total_f;
    }

    public void setTotal_f(double total_f) {
        this.total_f = total_f;
    }

    // método que calcula el descuento y luego se le aplica IVA
    //si no aplica descuento, a pesar de ser tradicional no aplica descuento y hace calculo regular.
    
    public double desc_f () {
        double Ccosto = 0.0;
        if (this.getTot_caracteres() > 15 && this.getTot_caracteres() < 19.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.03;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;
            
        } else if (this.getTot_caracteres() > 20 && this.getTot_caracteres() < 24.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.06;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;        
        } else if (this.getTot_caracteres() > 25 && this.getTot_caracteres() < 29.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.09;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;        
        } else if (this.getTot_caracteres() > 30 && this.getTot_caracteres() < 34.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.12;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;      
        } else if (this.getTot_caracteres() > 35 && this.getTot_caracteres() < 39.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.15;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;       
        } else if (this.getTot_caracteres() > 40 && this.getTot_caracteres() < 44.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.18;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;     
        } else if (this.getTot_caracteres() > 45 && this.getTot_caracteres() < 49.9) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.21;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto; 
        } else if (this.getTot_caracteres() > 50) {
            Ccosto = this.costo(this.getSeccion());
            descuento =  Ccosto *  0.24;
            Ccosto = Ccosto - descuento;
            total_f = Ccosto;    
        } else { 
            Ccosto = this.costo(this.getSeccion());
            total_f = Ccosto;}
         
    return total_f + this.IVA(Ccosto);    
    }

   

   

    
    
   
    
     
}
