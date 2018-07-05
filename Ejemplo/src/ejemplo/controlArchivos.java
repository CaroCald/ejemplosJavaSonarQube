/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Carolina
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class controlArchivos {
FileInputStream fis;


    public void escribirArchivoUsuario(Usuario p, File nombre){
        try {
            FileOutputStream foa= new FileOutputStream(nombre, true);

            ObjectOutputStream out = new ObjectOutputStream(foa);
            out.writeObject(p);
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            System.out.println("error IO1"+e);
        }
    }


    public void leerArchivoUsuario (File nombre, String user) throws IOException{
        Usuario p=null;
        try {
           fis= new FileInputStream(nombre);
           
                //datos= new Usuario[]{new Usuario(""+p.getUser(),""+p.getPassword(), "")};
                while(fis.available()>0){
                    ObjectInputStream is= new ObjectInputStream(fis);
                     p= (Usuario) is.readObject();
                     if(p.getUser().equals(user)){
                         System.out.println("SI ESTA");
                     }
                     else{
                         System.out.println("NO ESTA");

                     }
                }      
           

        } catch (FileNotFoundException e) {
            System.out.println("error archivo1"+e);
        }
        catch (IOException e) {
            System.out.println("error IO2"+e);
        } catch (ClassNotFoundException e) {
            System.out.println("error persona"+e);
        }finally {
            fis.close();
        }

     
    }
    public void leerArchivoUsuario2 (File nombre, String user) throws IOException{
        Usuario p=null;
        try {
           fis= new FileInputStream(nombre);
           
                //datos= new Usuario[]{new Usuario(""+p.getUser(),""+p.getPassword(), "")};
                while(fis.available()>0){
                    ObjectInputStream is= new ObjectInputStream(fis);
                     p= (Usuario) is.readObject();
                     if(p.getUser().equals(user)){
                         System.out.println("SI ESTA");
                     }
                     else{
                         System.out.println("NO ESTA");

                     }
                }      
           

        } catch (FileNotFoundException e) {
            System.out.println("error archivo1"+e);
        }
        catch (IOException e) {
            System.out.println("error IO2"+e);
        } catch (ClassNotFoundException e) {
            System.out.println("error persona"+e);
        }finally {
            fis.close();
        }

     
    }
}