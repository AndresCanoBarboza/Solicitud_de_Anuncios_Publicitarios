
package Logica;

import java.io.Serializable;
import java.util.ArrayList;


public class csAnuncio implements Serializable{
   private String titulo;
   private String fecha;
   private String seccion;
   private String descripcion;
   private int tot_caracteres;
   public double costo;
   public double IVA;
   private ArrayList<csAnuncio> canasta;
   
   //constructores 

   
   
   public csAnuncio(String titulo, String fecha, String seccion, String descripcion, int tot_caracteres, double costo, double IVA, double total) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.seccion = seccion;
        this.descripcion = descripcion;
        this.tot_caracteres = tot_caracteres;
        this.costo = costo;
        this.IVA = IVA;
        this.canasta = new ArrayList();
        
    }

      
   public csAnuncio() {
       this.titulo = "";
       this.fecha = "";
       this.seccion = "";
       this.descripcion = "";
       this.tot_caracteres = 0;
       this.costo = 0.0;
       this.IVA = 0.0;
       
    }

    public csAnuncio(csTradicional csTradicional) {
        super();
    }
    //set and get
    
    public String getTitulo () {
        
    return titulo;            
    
    }  
   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTot_caracteres() {
        return tot_caracteres;
    }

    public void setTot_caracteres(int tot_caracteres) {
        this.tot_caracteres = tot_caracteres;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public ArrayList<csAnuncio> getCanasta() {
        return canasta;
    }

    
    public void setCanasta(ArrayList<csAnuncio> canasta) {
        this.canasta = canasta;
    }

    // método para contar caracteres, se hace por separado (título y descripción y luego se suman)
    public int total_caracteres() {
        int tot_caracteres1;
        tot_caracteres1 = descripcion.length();
        
        int tot_caracteres2;
        tot_caracteres2 = titulo.length();
        tot_caracteres = tot_caracteres1+tot_caracteres2;
        
        return tot_caracteres;
    }
    // método para definir costo según caracteres contados
    
    
    
    public double costo (String seccion) {
        if (seccion.equals("Nacionales")){
            costo = 80 * tot_caracteres;
        }
        if (seccion.equals("Internacionales")) {
            costo = 70 * tot_caracteres;
        }
        if (seccion.equals("Deportes")) {
            costo = 90 * tot_caracteres;
        }
        if (seccion.equals("Culturales")) {
           costo = 85 * tot_caracteres;
        }
        if (seccion.equals("Económicos")) {
           costo = 50 * tot_caracteres;
        }
    return costo; 
    }
            
    public double IVA(double sub) {
       return sub* 0.13;
       
    }
    
    public double Total() {
        return costo + IVA(costo);
        
    }




}





