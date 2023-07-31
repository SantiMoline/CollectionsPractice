import java.util.Scanner;

import Ej5.Services.PaisService;

public class Ej5 {

    public static void main(String[] args) {
        PaisService ps = new PaisService();
        Scanner scan = new Scanner(System.in);

        ps.cargaConBucle();
        ps.mostrarPaises();

        System.out.println("La lista de paises ordenada alfabéticamente es la siguiente: ");
        ps.mostrarOrdenadosAlfabeticamente();

        System.out.println("Qué país desea quitar de la lista? ");
        String pais = scan.nextLine();
        if(ps.quitarPais(pais)) {
            System.out.println("El país se ha eliminado con éxito. Así quedó la lista: ");
            ps.mostrarOrdenadosAlfabeticamente();
        } else {
            System.out.println("Error al intentar quitar el país. El país indicado no se encontraba en la lista.");
        }

        scan.close();
    }

}

/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto.
El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar
otro país o si quiere salir, si decide salir, se mostrará todos los países guardados en el conjunto.
(Recordemos hacer los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y
si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en
el conjunto se le informará al usuario. */