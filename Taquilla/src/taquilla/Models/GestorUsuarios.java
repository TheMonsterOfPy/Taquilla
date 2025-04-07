/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taquilla.Models;

/**
 *
 * @author sant9
 */
import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<Usuario> usuarios;

    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}

