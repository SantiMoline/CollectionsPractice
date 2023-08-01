package ExtrasCollections.Extra02.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


import ExtrasCollections.Extra02.Entities.CantanteFamoso;

public class CantanteFamosoService {
    private ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public CantanteFamoso crearCantante() {
        System.out.print("Ingrese el nombre del cantante/bande: ");
        String name = scan.nextLine();
        System.out.println("Ingrese el nombre del disco más vendido: ");
        String disc = scan.nextLine();

        return new CantanteFamoso(name, disc);
    }

    public void registrarCantante() {
        cantantes.add(crearCantante());
    }

    public boolean eliminarCantate(String name) {
        Iterator<CantanteFamoso> iterator = cantantes.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().getCantante().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void mostrarCantantes() {
        cantantes.forEach((e)->System.out.println(e));
    }

    
}
