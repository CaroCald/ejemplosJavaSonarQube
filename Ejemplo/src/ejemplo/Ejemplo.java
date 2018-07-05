/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Carolina
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           File archivo=new File("D:\\texto.txt");

        controlArchivos archivos = new controlArchivos();
        Usuario usuario = new Usuario("dasda", "123", "invitado");
        Usuario usuario2 = new Usuario("dasdd2", "222", "invitado3");
        
                archivos.escribirArchivoUsuario(usuario, archivo);
                archivos.escribirArchivoUsuario(usuario2, archivo);
archivos.escribirArchivoUsuario(usuario, archivo);
                archivos.escribirArchivoUsuario(usuario2, archivo);archivos.escribirArchivoUsuario(usuario, archivo);
                archivos.escribirArchivoUsuario(usuario2, archivo);
                
    

        try {
            archivos.leerArchivoUsuario(archivo, "hppp");
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            
       
        
        
    }
    
}
