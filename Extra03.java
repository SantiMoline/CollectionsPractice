import java.util.Scanner;

import ExtrasCollections.Extra03.Services.LibreriaService;

public class Extra03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibreriaService libreriaService = new LibreriaService();

        System.out.println("Bienvenido a LibraryApp.");
        int opc;
        boolean active = true;
        String tittle;

        while (active) {
            showMenu();
            System.out.println("Indique la acción a realizar: ");
            opc = scan.nextInt();
            scan.nextLine(); //Throwaway scan.
            switch (opc) {
                case 1:
                    while(true) {
                        libreriaService.registrarLibro(libreriaService.generarLibro());
                        System.out.print("Desea cargar otro libro (S/N): ");
                        String continuar = scan.nextLine();
                        if (continuar.equalsIgnoreCase("S"))
                            continue;
                        else break;
                    }
                    break;
                case 2:
                    libreriaService.registrarLibro(libreriaService.generarLibro());
                    break;
                case 3:
                    System.out.print("Título del libro que desea consultar: ");
                    tittle = scan.nextLine();
                    System.out.println(libreriaService.consultarLibro(tittle));
                    break;
                case 4:
                    System.out.print("Título del libro que desea consultar: ");
                    tittle = scan.nextLine();
                    if (libreriaService.estaDisponible(libreriaService.getLibro(tittle)))
                        System.out.println("El libro '" + tittle + "' se encuentra disponible!");
                    else
                        System.out.println("El libro '" + tittle + "' NO se encuentra disponible!");
                    break;
                case 5:
                    System.out.print("Título del libro que desea alquilar: ");
                    tittle = scan.nextLine();
                    if (libreriaService.prestarLibro(tittle))
                        System.out.println("Aquí tiene el libro '" + tittle + "'. Que lo disfrute!");
                    else
                        System.out.println("El libro '" + tittle + "' NO cuenta con unidades disponibles para alquiler!");
                    break;
                case 6:
                    System.out.print("Título del libro que desea devolver: ");
                    tittle = scan.nextLine();
                    if (libreriaService.devolverLibro(tittle))
                        System.out.println("Gracias por devolver el libro '" + tittle + "'. Esperamos que lo haya disfrutado!");
                    else
                        System.out.println("El libro '" + tittle + "' NO cuenta con unidades alquiladas para devolver!");
                    break;
                case 7:
                    System.out.println("Los libros en nuestros registros son los siguientes: ");
                    System.out.println(libreriaService.getLibrary());
                    break;
                default:
                    System.out.println("Hasta la próxima!");
                    active = false;
                    break;
            }
        }

        scan.close();
    }

    public static void showMenu() {
        System.out.println("------------LibraryAPP------------");
        System.out.println("1. Registrar libros.");
        System.out.println("2. Registrar nuevo libro.");
        System.out.println("3. Consultar información de un libro.");
        System.out.println("4. Consultar disponibilidad de un libro.");
        System.out.println("5. Alquilar un libro.");
        System.out.println("6. Devolver un libro.");
        System.out.println("7. Consultar todos los libros en nuestro registro.");
        System.out.println("8. Salir.");
    }
}
/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos.
Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados. También se creará en el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y los seteandolos en el Libro.
Despues, ese Libro se guarda en el conjunto y se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
● Constructor por defecto.
● Constructor con parámetros.
● Métodos Setters/getters
● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un préstamo del libro.
No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se produzca la devolución de un libro.
No se podrán devolver libros donde que no tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en caso contrario.
● Método toString para mostrar los datos de los libros. */