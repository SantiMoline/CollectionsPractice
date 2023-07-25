package Ej3.Entities;

import java.util.ArrayList;

public class Alumno {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    //Constructor
    public Alumno(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    //Constructor with empty grades.
    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    /**
     * Function name: setGrade
     * @param grade     (int)
     * 
     * Description: Add one grade to the grades array.
     */
    public void setGrade(int grade) {
        this.grades.add(grade);
    }

}

//La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
