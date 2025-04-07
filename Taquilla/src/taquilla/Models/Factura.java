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

public class Factura {
    private ArrayList<Boleta> boletas;

    public Factura() {
        boletas = new ArrayList<>();
    }

    public void agregarBoleta(Boleta b) {
        boletas.add(b);
    }

    public void imprimirFactura() {
        double total = 0;
        System.out.println("----- Factura -----");
        for (Boleta b : boletas) {
            System.out.println(b.getDetalle());
            total += b.getPrecioFinal();
        }
        System.out.println("Total a pagar: $" + total);
    }
}

