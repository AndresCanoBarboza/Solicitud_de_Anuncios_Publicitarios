
package Datos;

import Logica.csAnuncio;
import Logica.csCliente;
import Logica.csCompra;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class csDatos extends csAnuncio implements Serializable {
    
    private static ArrayList<csCliente> clientes = new ArrayList();
    private static ArrayList<csAnuncio> anuncios = new ArrayList();
    private static ArrayList<csCompra> ventas = new ArrayList();
    // Funciones para CLinetes
    
    public static void AddCliente(csCliente cliente) {
        clientes.add(cliente);
        GuardarCliente();
    }
    
    private static void GuardarCliente() {
        try {
            FileOutputStream archivo = new FileOutputStream ("src/Datos/Clientes.dat");
            ObjectOutputStream writer = new ObjectOutputStream (archivo);
            writer.writeObject(clientes);
            writer.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El archivo no fue guardado.");
        }
    }
    
    public static void CargarCliente() {
        try {
            FileInputStream archivo = new FileInputStream ("src/Datos/Clientes.dat");
            ObjectInputStream reader = new ObjectInputStream(archivo);
            clientes = (ArrayList<csCliente>)reader.readObject();
            reader.close();
        } catch (Exception e) {
        }
    }  
    
    public static void CargarCliente(JComboBox comb) {
        for (csCliente cliente : clientes)
            comb.addItem(cliente.getCedula());
    }  
    
    public static boolean EncontrarCliente(int cedula) {
        for (csCliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                return true;
            }
        }
     return false;    
    }    
    
    
    public static void MostrarCliente(JTable tb) {
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        
        for (csCliente cliente : clientes) {
            model.addRow(new Object[]{cliente.getCedula(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(), cliente.getEdad()});
        }
        
    }
    
          
        
       
    
    //Funciones para Anuncios
    
    public static void AddAnuncio(csAnuncio anuncio) {
        anuncios.add(anuncio);
        GuardarAnuncio();
    }
    
    private static void GuardarAnuncio() {
        try {
            FileOutputStream archivo = new FileOutputStream ("src/Datos/Anuncios.dat");
            ObjectOutputStream writer = new ObjectOutputStream(archivo);
            writer.writeObject(anuncios);
            writer.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El archivo no fue guardado.");
        }
    }
    
    public static void CargarAnuncio() {
        try {
            FileInputStream archivo = new FileInputStream ("src/Datos/Anuncios.dat");
            ObjectInputStream reader = new ObjectInputStream(archivo);
            anuncios = (ArrayList<csAnuncio>)reader.readObject();
            reader.close();
        } catch (Exception e) {
        }
    }  
    
    public static void CargarAnuncio(JComboBox comb) {
        for (csAnuncio anuncio : anuncios)
            comb.addItem(anuncio.getTitulo());
    }  
    
    public static boolean EncontrarAnuncio(String nombre) {
        for (csAnuncio anuncio : anuncios) {
            if (anuncio.getTitulo().equalsIgnoreCase(nombre));  {
                return false;
            }
        }
    return true;    
    }    
    
    
    public static void MostrarAnuncio(JTable tb) {
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        
        for (csAnuncio anuncio : anuncios) {
          //  model.addRow(new Object[]{auncio.getCedula(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(), cliente.getEdad()});
            model.addRow(new Object[]{anuncio.getFecha(), anuncio.getTitulo(), anuncio.getSeccion(), anuncio.Total()});
        }
        
    }
    
    // Funciones para ventas
    
    public static void AgregarVenta(int poscliente, int posanuncio) {
        csCompra compra = new csCompra(anuncios.get(posanuncio));
        clientes.get(poscliente).AgregarAnuncio(compra);
        GuardarCliente();
    }
        
    public static void MostrarVentas(JTable tb, int poscliente) {
      DefaultTableModel model = (DefaultTableModel) tb.getModel();
      while(model.getRowCount() != 0) {
          model.removeRow(0);
      }
        csCliente clienteseleccionado = clientes.get(poscliente);
        ArrayList<csCompra> compras = clienteseleccionado.getCanasta();
        
        for (csCompra compra : compras) {
           model.addRow(new Object[]{compra.getAnuncio().getTitulo(), compra.getAnuncio().getCosto()});
        }
        
    }  
    
}  

