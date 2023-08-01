package ExtrasCollections.Extra03.Entities;
import java.util.Objects;

public class Libro {
    private String tittle;
    private String author;
    private int quantInStock;
    private int borrowedQuantity;


    public Libro(String tittle, String author, int quantInStock) {
        this.tittle = tittle;
        this.author = author;
        this.quantInStock = quantInStock;
        this.borrowedQuantity = 0; //By default, the borrowed quantity of a book at the moment of it's creation is 0.
    }

    //Getters & Setters
    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantInStock() {
        return this.quantInStock;
    }

    public void setQuantInStock(int totalQuantity) {
        this.quantInStock = totalQuantity;
    }

    public int getBorrowedQuantity() {
        return this.borrowedQuantity;
    }

    public void setBorrowedQuantity(int borrowedQuantity) {
        this.borrowedQuantity = borrowedQuantity;
    }


    //equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(tittle, libro.tittle) && Objects.equals(author, libro.author);
        //Don't need to compare quantities in stock or borrowed to know when books are equal one to another.
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittle, author);
        //Don't need to compare quantities in stock or borrowed to know when books are equal one to another.
    }
    
    //toString
    @Override
    public String toString() {
        return
            "\nTittle: " + getTittle() +
            "\nAuthor: " + getAuthor() +
            "\nTotal Quantity: " + getQuantInStock() +
            "\nBorrowed Quantity: " + getBorrowedQuantity() + 
            "\n-----------------------------------------------------";
    }

}
/*Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados. */