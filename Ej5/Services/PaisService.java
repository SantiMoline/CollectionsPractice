package Ej5.Services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Ej5.Entities.Pais;
import Ej5.Utilities.PaisComparator;

public class PaisService {
    private HashSet<Pais> paises = new HashSet<>();
    private Scanner scan = new Scanner(System.in);

    public Pais crearPais() {
        System.out.print("Nombre del pais: ");
        return new Pais(scan.nextLine());
    }

    public void cargarPais(Pais pais) { 
        paises.add(pais);
    }

    public void cargaConBucle() {
        String opc = "";
        while (!opc.equalsIgnoreCase("N")) {
            cargarPais(crearPais());
            System.out.print("Desea continuar? (Y/N)");
            opc = scan.nextLine();
        }
        System.out.println("Se finalizó con la carga de países.");
    }

    public void mostrarPaises() {
        paises.forEach((e)->System.out.println(e)); //Stream de impresión en el video 5.
    }

    /**
     * Function name: mostrarOrdenadosAlfabeticamente
     * 
     * Description: creates an ArrayList from the HashSet, and sorts it by name. Print the sorted ArrayList.
     */
    public void mostrarOrdenadosAlfabeticamente() {
        ArrayList<Pais> listaPaises= new ArrayList<Pais>(paises);
        listaPaises.sort(PaisComparator.compararNombre);
        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }
    }

    /**
     * Function name: quitarPais
     * @param pais      (String)
     * @return          (boolean)
     * 
     * Description: Search for the country with the recieved name, deletes it and returns true. Returns false otherwise
     */
    public boolean quitarPais(String pais) {
        Iterator<Pais> iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equalsIgnoreCase(pais)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
