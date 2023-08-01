import java.util.Scanner;

import ExtrasCollections.Extra02.Services.CantanteFamosoService;


public class Extra02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CantanteFamosoService cfs = new CantanteFamosoService();
        boolean active = true;

        System.out.println("Cuántos cantantes quiere cargar? ");
        int cant = scan.nextInt();
        for (int i = 0; i < cant; i++) {
            cfs.registrarCantante();
        }

        int opc;
        while (active) {
            showMenu();
            System.out.print("Indique la acción a realizar: ");
            opc = scan.nextInt();
            scan.nextLine(); //Throwaway scan.
            switch (opc) {
                case 1:
                    cfs.registrarCantante();
                    break;
                case 2:
                    System.out.println("La lista de cantantes/bandas es la siguiente: ");
                    cfs.mostrarCantantes();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cantante/banda a borrar: ");
                    String name = scan.nextLine();
                    if(cfs.eliminarCantate(name))
                        System.out.println("Se ha eliminado el registro con éxito.");
                    else 
                        System.out.println("El cantante/banda no se encontraba en nuestros registros.");
                    break;
                default:
                    active = false;
                    System.out.println("Hasta la próxima!");
                    break;
            }
        }
        scan.close();
    }

    public static void showMenu() {
        System.out.println("Qué desea hacer? ");
        System.out.println("1. Agregar un nuevo cantante.");
        System.out.println("2. Mostrar todos los cantantes.");
        System.out.println("3. Eliminar un cantante.");
        System.out.println("4. Salir.");
    }
    
}
/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo CantanteFamoso a la lista.
Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de agregar un cantante más, mostrar todos los cantantes,
eliminar un cantante que el usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios */