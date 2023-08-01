import java.util.Scanner;

import Ej6.Services.ProductoService;

public class Ej6 {
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        Scanner scan = new Scanner(System.in);
        boolean active = true;
        int opc = 0;
        String product;
        Double price;
        System.out.println("-------Bienvenido al gesto de Productos-------");
        while (active) {
            showMenu();
            opc = scan.nextInt();
            scan.nextLine();//Throwaway scan.
            switch (opc) {
                case 1:
                    ps.agregarProducto();
                    break;
                case 2:
                    System.out.print("Indique el producto que quiere modificar: ");
                    product = scan.nextLine().toUpperCase();
                    System.out.print("Indique el nuevo precio: ");
                    price = scan.nextDouble();
                    scan.nextLine(); //Throwaway scan.
                    ps.changePrice(product, price);
                    break;
                case 3:
                    System.out.print("Indique el producto a consultar: ");
                    product = scan.nextLine().toUpperCase();
                    price = ps.getPrice(product); 
                    if (price != null)
                        System.out.println("El precio del producto (" + product + ") es: " + price);
                    else 
                        System.out.println("El producto no se encuentra en nuestros registros.");
                    break;
                case 4:
                    System.out.print("Indique el producto que desea eliminar: ");
                    product = scan.nextLine().toUpperCase();
                    if (ps.deleteProduct(product))
                        System.out.println("El producto (" + product + ") fue eliminado exitósamente.");
                    else System.out.println("El producto no se encuentra en nuestros registros.");
                    break;
                case 5:
                    System.out.println("La lista de productos es la siguiente: ");
                    ps.showProducts();
                    System.out.println("\n---------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-------Hasta la próxima!-------");
                    active = false;
                    break;
            }
        }
        scan.close();
    }

    public static void showMenu() {
        System.out.println("\nQué desea hacer?");
        System.out.println("1. Cargar un nuevo producto.");
        System.out.println("2. Modificar el precio de un producto.");
        System.out.println("3. Consultar el precio de un producto: ");
        System.out.println("4. Eliminar producto.");
        System.out.println("5. Ver lista de productos.");
        System.out.println("6. Salir.");
        System.out.print("Introduzca su opción: ");
    }
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y
el precio que tendrán. Además, se necesita que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto y
mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. */