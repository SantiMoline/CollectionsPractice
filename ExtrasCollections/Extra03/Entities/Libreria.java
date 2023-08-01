package ExtrasCollections.Extra03.Entities;

import java.util.HashSet;

public class Libreria {
    HashSet<Libro> libreria = new HashSet<>();

    //Empty constructor
    public Libreria() {
    }

    //Constructor
    public Libreria(HashSet<Libro> libreria) {
        this.libreria = libreria;
    }

    //Getters & Setters.
    public HashSet<Libro> getLibreria() {
        return this.libreria;
    }

    public void setLibreria(HashSet<Libro> libreria) {
        this.libreria = libreria;
    }

    //toString
    @Override
    public String toString() {
        String libros = "";
        for (Libro libro : libreria) {
            libros += libro.toString();
        }
        return libros;
    }

}
