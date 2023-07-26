import Ej4.Entities.Pelicula;
import Ej4.Services.PeliculaService;

public class Ej4 {
    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();
        ps.addMovie(new Pelicula("Star Wars", "George Lukas", 2.24));
        ps.addMovie(new Pelicula("Titanic", "James Cameron", 0.99));
        ps.addMovie(new Pelicula("Interestellar", "Cristopher Nolan", 1.86));
        ps.addMovie(new Pelicula("Kill Bill", "Quentin Tarantino", 1.45));
        ps.addMovie(new Pelicula("Batman", "Cristopher Nolan", 0.95));


        System.out.println("--------Bienvenido al gestor de pelis =)--------");
        //ps.agregarPelicula();

        System.out.println("Las películas ingresadas son: ");
        ps.mostrarPeliculas();

        System.out.println("Las películas con más de una hora de duración son las siguientes: ");
        ps.mostrarPeliculasMayorUnaHora();

        System.out.println("Listado de películas ordenads de manera descendente de acuerdo a su duración: ");
        ps.ordenarPorDuracionDescendente();
        ps.mostrarPeliculas();

        System.out.println("Listado de películas ordenado de manera ascendente de acuerdo a su duración: ");
        ps.ordenarPorDuracionAscendente();
        ps.mostrarPeliculas();

        System.out.println("Listado de películas ordenado alfabéticamente por título: ");
        ps.ordenarPorTitulo();
        ps.mostrarPeliculas();

        System.out.println("Listado de películas ordenados alfabéticamente por director: ");
        ps.ordenarPorDirector();
        ps.mostrarPeliculas();

    }
}

/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y
guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/