import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Ingrese una raza de perro: ");
            razas.add(scan.nextLine());
            System.out.print("Desea continuar? Y/N: ");
            String opc = scan.nextLine();
            if (opc.equalsIgnoreCase("y"))
                continue;
            else break;
        }
        for (String raza : razas) {
            System.out.println(raza);
        }
        scan.close();

    }
}
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario
si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */