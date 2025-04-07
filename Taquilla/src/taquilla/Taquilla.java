/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taquilla;
import taquilla.Models.Boleta;
import taquilla.Models.Factura;
import taquilla.Models.Funcion;
import taquilla.Models.GestorPeliculas;
import taquilla.Models.GestorUsuarios;
import taquilla.Models.Pelicula;
import taquilla.Models.Usuario;
/**
 *
 * @author sant9
 */
import java.util.Scanner;

public class Taquilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorPeliculas gestorPeliculas = new GestorPeliculas();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();

        Funcion primera = new Funcion("Primera", 50);
        Funcion tarde = new Funcion("Tarde", 10);
        Funcion noche = new Funcion("Noche", 0);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Agregar usuario");
            System.out.println("3. Vender boletas");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Titulo de la pelicula: ");
                String titulo = sc.nextLine();
                System.out.print("Costo base: ");
                double costo = sc.nextDouble();
                sc.nextLine();
                gestorPeliculas.agregarPelicula(new Pelicula(titulo, costo));

            } else if (opcion == 2) {
                System.out.print("Nombre del usuario: ");
                String nombre = sc.nextLine();
                System.out.print("Tipo (Nino, Adulto, Mayor): ");
                String tipo = sc.nextLine();
                gestorUsuarios.agregarUsuario(new Usuario(nombre, tipo));

            } else if (opcion == 3) {
                Factura factura = new Factura();

                while (true) {
                    System.out.println("Ingrese el numero de la pelicula:");
                    for (int i = 0; i < gestorPeliculas.getPeliculas().size(); i++) {
                        System.out.println(i + ". " + gestorPeliculas.getPeliculas().get(i).getTitulo());
                    }
                    int idxP = sc.nextInt();

                    System.out.println("Ingrese el numero del usuario:");
                    for (int i = 0; i < gestorUsuarios.getUsuarios().size(); i++) {
                        System.out.println(i + ". " + gestorUsuarios.getUsuarios().get(i).getNombre());
                    }
                    int idxU = sc.nextInt();

                    System.out.println("Funcion (1. Primera, 2. Tarde, 3. Noche): ");
                    int tipoF = sc.nextInt();

                    Funcion funcionSeleccionada = tipoF == 1 ? primera : tipoF == 2 ? tarde : noche;

                    Pelicula pel = gestorPeliculas.getPeliculas().get(idxP);
                    Usuario usu = gestorUsuarios.getUsuarios().get(idxU);

                    Boleta boleta = new Boleta(pel, funcionSeleccionada, usu);
                    factura.agregarBoleta(boleta);

                    System.out.print("Desea agregar otra boleta? (s/n): ");
                    sc.nextLine();
                    String continuar = sc.nextLine();
                    if (!continuar.equalsIgnoreCase("s")) break;
                }

                factura.imprimirFactura();

            } else if (opcion == 4) {
                break;
            }
        }

        sc.close();
    }
}

