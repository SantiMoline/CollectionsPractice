package Ej5.Utilities;

import java.util.Comparator;

import Ej5.Entities.Pais;

public class PaisComparator {
    
    public static Comparator<Pais> compararNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return (p1.getNombre().compareTo(p2.getNombre()));
        }
    };
}
