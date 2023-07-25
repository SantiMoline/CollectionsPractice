import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //Load the ArrayList with user input.
        while(true) {
            System.out.print("Ingrese una raza de perro: ");
            razas.add(scan.nextLine());
            System.out.print("Desea continuar? Y/N: ");
            String opc = scan.nextLine();
            if (opc.equalsIgnoreCase("y"))
                continue;
            else break;
        }

        //Print the arrayList
        for (String raza : razas) {
            System.out.println(raza);
        }


        System.out.print("Elija una raza de perro: ");
        String choice = scan.nextLine();
        Iterator<String> iterator = razas.iterator();
        boolean razaEncontrada = false;
        //Search for the element in the list and deletes it.
        while (iterator.hasNext()) {
            if(iterator.next().equals(choice)) {
                iterator.remove();
                razaEncontrada = true;
                break;
            }
        }
        //Sort the list.
        Collections.sort(razas);

        //If the previous action deleted an element, we print a message. 
        if (razaEncontrada) System.out.println("La raza solicitada se eliminó de la lista.");
        else System.out.println("La raza indicada no era parte de la lista.");

        System.out.println("La lista quedó ordenada de la siguiente manera: ");
        iterator = razas.iterator(); //To reset the position of iterator back to the beginning of the list.
        //We print the ArrayList after sorted.
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        scan.close();
    }
}
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y 
se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada.
Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
 */