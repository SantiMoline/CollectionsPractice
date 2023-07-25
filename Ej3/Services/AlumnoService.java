package Ej3.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Ej3.Entities.Alumno;

public class AlumnoService {
    ArrayList <Alumno> alumnos = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    /**
     * Function name: crearAlumno
     * @return      (Alumno)
     * Description: creates an instance of 'Alumno' with user input.
     */
    public Alumno crearAlumno() {
        System.out.print("Ingrese nombre del alumno: ");
        Alumno alumno = new Alumno(scan.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            alumno.setGrade(scan.nextInt());
        }
        scan.nextLine(); //Throwaway scan.
        return alumno;
    }

    public void cargarAlumnos() {
        String choice = "";
        while (!choice.equalsIgnoreCase("N")) {
            alumnos.add(crearAlumno());
            System.out.println("Desea continuar? Y/N");
            choice = scan.nextLine();
        }
    }

    /**
     * Function name: buscarAlumno
     * @param name      (String)
     * @return          (Alumno)
     * 
     * Description: search for the element with the chosed 'name'. Returns null if it doesn't exist.
     */
    public Alumno buscarAlumno(String name) {
        for (Alumno alumno : alumnos) {
            if (alumno.getName().equalsIgnoreCase(name)) return alumno;

        }
        return null;
    }

    /**
     * 
     * @param alumno        (Alumno)
     * @return              (double)
     * 
     * Description: Returns the average note from the recieved instance of 'Alumno'.
     */
    public double notaFinal(Alumno alumno) {
        if (alumno == null) return 0; //to avoid Exceptions.

        double suma = 0;
        Iterator<Integer> iterator = alumno.getGrades().iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        return suma / alumno.getGrades().size();
    }
}
/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y
ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no. 

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos.
Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
*/