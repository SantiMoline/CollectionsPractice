package ExtrasCollections.Extra03.Services;

import java.util.Scanner;

import ExtrasCollections.Extra03.Entities.Libro;

public class LibroService {
    Scanner scan = new Scanner(System.in);

    public Libro crearLibro() {
        System.out.print("Ingrese el título del libro: ");
        String tittle = scan.nextLine(); 
        System.out.print("Ingrese el autor: ");
        String author = scan.nextLine();
        System.out.print("Indique la cantidad de libros adquiridos para tener en stock: ");
        int stock = scan.nextInt();
        scan.nextLine(); //Throwaway scan.

        return new Libro(tittle, author, stock);
    }

    public void actualizarCantitadesPorDevolucion(Libro book) {
        book.setBorrowedQuantity(book.getBorrowedQuantity() - 1);
        book.setQuantInStock(book.getQuantInStock() + 1);
    }

    public void actualizarCantidadesPorAlquiler(Libro book) {
        book.setQuantInStock(book.getQuantInStock() - 1);
        book.setBorrowedQuantity(book.getBorrowedQuantity() + 1);
    }

}
