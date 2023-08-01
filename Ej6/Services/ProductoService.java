package Ej6.Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    private HashMap<String,Double> products = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public void agregarProducto() {
        String product;
        Double price;

        System.out.print("Ingrese el producto: ");
        product = scan.nextLine().toUpperCase();
        System.out.print("Indique el precio del producto ingresado (" + product + "): ");
        price = scan.nextDouble();
        scan.nextLine(); //Throwaway scan.
        products.put(product, price);
    }

    public boolean productExist(String product) {
        return products.containsKey(product);
    }

    public void changePrice(String product, Double price) {
        if(productExist(product))
            products.put(product, price);
        else
            System.out.println("El producto indicado no existe.");
    }

    public boolean deleteProduct(String product) {
        return products.remove(product) != null; //Remove methods returns null when the key does not exist, or when it has associated null value. For this activity, is the same.
    }

    public Double getPrice(String product) {
        if (productExist(product))
            return products.get(product);
        else 
            return null;
    }

    public void showProducts() {
        if (products.size() == 0) {
            System.out.println("No existen productos en nuestro catálogo.");
        } else {
            for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.print("\nProduct: " + entry.getKey());
            System.out.print(", Price: " + entry.getValue());
        }
        }


    }

}
/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto y
mostrar los productos que tenemos con su precio (Utilizar Hashmap) */