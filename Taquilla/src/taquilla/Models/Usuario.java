/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taquilla.Models;

/**
 *
 * @author sant9
 */
public class Usuario {
    private String nombre;
    private String tipo; // "Nino", "Adulto", "Mayor"

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDescuento() {
        if (tipo.equalsIgnoreCase("Nino")) return 500;
        if (tipo.equalsIgnoreCase("Mayor")) return 1000;
        return 0;
    }
}
