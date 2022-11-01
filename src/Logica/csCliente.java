
package Logica;

import java.io.Serializable;
import java.util.ArrayList;


public class csCliente implements Serializable {
    
    private int cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private ArrayList<csCompra> canasta;

    
    // Constructores
    
    public csCliente(int cedula, String nombre, String apellido1, String apellido2, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.canasta = new ArrayList();
    }

    public csCliente() {
        super();
    }

    
    //Getter and Setter
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<csCompra> getCanasta() {
        return canasta;
    }

    public void setCanasta(ArrayList<csCompra> canasta) {
        this.canasta = canasta;
    }
    
    public void AgregarAnuncio(csCompra anuncio) {
        this.canasta.add(anuncio);
    }
    
}
