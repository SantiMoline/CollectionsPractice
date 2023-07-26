package Ej4.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Ej4.Entities.Pelicula;

public class PeliculaService {
    private Scanner scan = new Scanner(System.in);
    private ArrayList <Pelicula> peliculas = new ArrayList<>();


    public Pelicula crearPelicula() {
        System.out.print("Ingrese el título de la película: ");
        String title = scan.nextLine();
        System.out.print("Indique el nombre del director: ");
        String director = scan.nextLine();
        System.out.print("Indique la duración de la película (en hs): ");
        double duration = scan.nextDouble();
        scan.nextLine(); //Throwaway scan.

        return new Pelicula(title, director, duration);
    }

    public void agregarPelicula() {
        String choice = "";

        while (!choice.equalsIgnoreCase("N")) {
            peliculas.add(crearPelicula());
            System.out.println("Desea continuar? (Y/N)");
            choice = scan.nextLine();
        }
    }

    //Method to add one movie from main, just for testing.
    public void addMovie(Pelicula movie) {
        peliculas.add(movie);
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println("---------------------");
            System.out.println(pelicula);
            System.out.println("---------------------");
        }
    }

    public void mostrarPeliculasMayorUnaHora() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("---------------------");
                System.out.println(pelicula);
                System.out.println("---------------------");
            }
        }
    }

    public void ordenarPorDuracionDescendente() {
        Collections.sort(peliculas, Pelicula.compararDuracionDescendente);
    }

    public void ordenarPorDuracionAscendente() {
        Collections.sort(peliculas, Pelicula.compararDuracionAscendente);
    }

    public void ordenarPorTitulo() {
        Collections.sort(peliculas,Pelicula.compararTitulo);
    }

    public void ordenarPorDirector() {
        Collections.sort(peliculas,Pelicula.compararDirector);
    }

}
/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y
guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. */