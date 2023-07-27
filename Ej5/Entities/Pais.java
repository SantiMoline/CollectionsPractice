package Ej5.Entities;

import java.util.Comparator;

public class Pais {
    String nombre;


    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Comparator.
    public static Comparator<Pais> compararNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return (p1.getNombre().compareTo(p2.getNombre()));
        }
    };

    //toString
    @Override
    public String toString() {
        return
            "---Pais: " + getNombre() + "---";
    }

}
