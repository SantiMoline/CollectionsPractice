package Ej4.Entities;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;


    //Constructor
    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //Getters & Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //Comparators.
    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare (Pelicula p1, Pelicula p2) {
            //return p2.getDuracion().compareTo(p1.getDuracion());
            //No lo pude hacer funcionar. Creo que el compareTo() es para String solamente. 
            if (p1.getDuracion() == p2.getDuracion()) return 0;
            else if (p1.getDuracion() > p2.getDuracion()) return 1;
            else return -1;
        }
    };

    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare (Pelicula p1, Pelicula p2) {
            //return p2.getDuracion().compareTo(p1.getDuracion());
            //No lo pude hacer funcionar. Creo que el compareTo() es para String solamente. 
            if (p1.getDuracion() == p2.getDuracion()) return 0;
            else if (p1.getDuracion() > p2.getDuracion()) return -1;
            else return 1;
        }
    };

    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare (Pelicula p1, Pelicula p2) {
            return (p1.getTitulo().compareTo(p2.getTitulo()));
        }
    };

    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare (Pelicula p1, Pelicula p2) {
            return (p1.getDirector().compareTo(p2.getDirector()));
        }
    };

    //toString
    @Override
    public String toString() {
        return
            "Título: " + getTitulo() + 
            "\nDirector: " + getDirector() +
            "\nDuración: " + getDuracion();
    }

}
/*tendremos una clase Pelicula con el título, director y duración de la película (en horas). */