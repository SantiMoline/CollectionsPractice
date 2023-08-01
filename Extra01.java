import java.util.ArrayList;
import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Integer num = 0;

        System.out.println("Ingrese los números a cargar: ");
        while(num != -99) {
            num = scan.nextInt();
            if (num == -99) break;
            ints.add(num);
        }

        System.out.println("Se han cargado " + ints.size() + " números.");
        System.out.println("La suma de los números cargados es: " + calcularSuma(ints));
        System.out.println("El promedio de los números cargados es: " + ((double) calcularSuma(ints)) / ints.size());

        scan.close();
    }

    public static int calcularSuma(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer n : nums) {
            sum+=n;
        }
        return sum;
    }
}
/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList.
A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma y su media (promedio). */