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
import java.io.Serializable;

public class Usuario implements Serializable {

    private String user, password, tipo, correo;

    public Usuario(String user, String password, String tipo){
        this.user=user;
        this.password=password;
        this.tipo=tipo;
    }
    public Usuario(String user, String correo){
        this.user=user;
        this.correo=correo;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
