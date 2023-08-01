package ExtrasCollections.Extra03.Services;

import ExtrasCollections.Extra03.Entities.Libreria;
import ExtrasCollections.Extra03.Entities.Libro;

public class LibreriaService {
    private Libreria library = new Libreria();
    private LibroService ls = new LibroService();
    

    public void registrarLibro(Libro book) {
        library.getLibreria().add(book);
    }

    public Libro generarLibro() {
        return ls.crearLibro();
    }


    public Libro getLibro(String tittle) {
        for (Libro libro : library.getLibreria()) {
            if(libro.getTittle().equalsIgnoreCase(tittle))
                return libro;
        }
        return null;
    }

    public Libreria getLibrary() {
        return this.library;
    }

    public String consultarLibro(String tittle) {
        Libro book = getLibro(tittle);
        if (book == null) 
            return "El libro no se encuentra en nuestros registros.";
        else
            return book.toString();
    }

    public boolean estaDisponible(Libro book) {
        return book.getQuantInStock() > 0;
    }

    public boolean hayPrestados(Libro book) {
        return book.getBorrowedQuantity() > 0;
    }

    public boolean prestarLibro(String tittle) {
        Libro libro = getLibro(tittle);
        if(libro == null || !estaDisponible(libro))
            return false;
        else {
            ls.actualizarCantidadesPorAlquiler(libro);
            return true;
        }
    }

    public boolean devolverLibro(String tittle) {
        Libro libro = getLibro(tittle);
        if(libro == null || !hayPrestados(libro))
            return false;
        else {
            ls.actualizarCantitadesPorDevolucion(libro);
            return true;
        }
    }
}
