/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taquilla.Models;

/**
 *
 * @author sant9
 */
public class Boleta {
    private Pelicula pelicula;
    private Funcion funcion;
    private Usuario usuario;
    private double precioFinal;

    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal() {
        double base = pelicula.getCostoBase();
        double descuentoFuncion = base * (funcion.getDescuento() / 100);
        double descuentoUsuario = usuario.getDescuento();

        precioFinal = base - descuentoFuncion - descuentoUsuario;
        if (precioFinal < 0) {
            precioFinal = 0;
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public String getDetalle() {
        return "Pelicula: " + pelicula.getTitulo() + ", Funcion: " + funcion.getNombre() +
               ", Usuario: " + usuario.getNombre() + ", Tipo: " + usuario.getTipo() +
               ", Precio: $" + precioFinal;
    }
}

