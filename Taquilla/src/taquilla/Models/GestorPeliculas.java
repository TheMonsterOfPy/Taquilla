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

public class GestorPeliculas {
    private ArrayList<Pelicula> peliculas;

    public GestorPeliculas() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
}

