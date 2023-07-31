package Ej5.Entities;
import java.util.Objects;

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

    // equals() & hashCode()
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pais)) {
            return false;
        }
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNombre());
    }

    //toString
    @Override
    public String toString() {
        return
            "---Pais: " + getNombre() + "---";
    }
    
}
