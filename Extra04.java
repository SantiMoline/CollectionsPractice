import java.util.Scanner;

import ExtrasCollections.Extra04.Services.CityService;

public class Extra04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CityService cs = new CityService();
        boolean active = true;
        int opc;
        Integer zip;
        String city;

        while (active) {
            showMenu();
            System.out.print("Indique qué acción desea realizar: ");
            opc = scan.nextInt();
            scan.nextLine(); //Throwaway scan.
   
            switch (opc) {
                case 1: 
                    System.out.print("Ingrese cuántas ciudades quiere cargar: ");
                    int cant = scan.nextInt();
                    scan.nextLine(); //Throwaway scan.
                    for (int i = 0; i < cant; i++) {
                        cs.addCity();
                    }
                    break;
                case 2:
                    cs.addCity();
                    break;
                case 3:
                    System.out.print("Ingrese el Zip Code: ");
                    zip = scan.nextInt();
                    scan.nextLine(); //Throwaway scan.
                    city = cs.buscarCiudadPorZipCode(zip);
                    if (city != null)
                        System.out.print("\nCiudad: " + city + "\tZip Code: " + zip);
                    else 
                        System.out.println("No se encuentra una ciudad con ese Zip Code en nuestros registros.");
                    break;
                case 4:
                    System.out.print("Ingrese la ciudad: ");
                    city = scan.nextLine();
                    zip = cs.buscarZipCodePorCiudad(city);
                    if (zip != null) 
                        System.out.print("\nCiudad: " + city + "\tZip Code: " + zip);
                    else
                        System.out.println("No se encuentra la ciudad indicada en nuestros registros.");
                    break;
                case 5:
                    System.out.print("Ingrese la ciudad a eliminar: ");
                    city = scan.nextLine();
                    if (cs.borrarCiudad(city)) 
                        System.out.println("La ciudad " + city + " se ha borrado correctamente.");
                    else
                        System.out.println("No se encuentra la ciudad indicada en nuestros registros.");
                    break;
                case 6:
                    System.out.println("La lista de registros es la siguiente: ");
                    cs.mostrarCiudades();
                    break;
                default:
                    System.out.println("Nos vemos la próxima!");
                    active = false;
                    break;
                }
        }
        scan.close();
    }

    public static void showMenu() {
        System.out.println("\n----------Menu----------");
        System.out.println("1. Cargar múltiples ciudades.");
        System.out.println("2. Cargar una ciudad nueva.");
        System.out.println("3. Buscar ciudad por Zip Code.");
        System.out.println("4. Consultar Zip Code de una ciudad.");
        System.out.println("5. Eliminar ciudad.");
        System.out.println("6. Mostrar todos los registros.");
        System.out.println("7. Salir.");
    }
}
/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos */