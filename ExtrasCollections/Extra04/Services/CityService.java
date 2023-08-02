package ExtrasCollections.Extra04.Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityService {
    private HashMap<Integer, String> cities = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public void addCity() {
        System.out.print("Ingrese la ciudad a guardar: ");
        String city = scan.nextLine();
        System.out.println("Ingrese el código postal de la misma: ");
        Integer zipCode = scan.nextInt();
        scan.nextLine(); //Throwaway scan.

        cities.put(zipCode, city);
    }

    public String buscarCiudadPorZipCode(int zip) {
        return cities.get(zip);
    }

    public Integer buscarZipCodePorCiudad(String city) {
        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            if(entry.getValue().equalsIgnoreCase(city))
                return entry.getKey();
        }
        return null;
    }

    public boolean borrarCiudad(String city) {
        Integer zipToErased = buscarZipCodePorCiudad(city);
        if (zipToErased == null){
            return false;
        } else {
            cities.remove(zipToErased);
            return true;
        }
    }


    public void mostrarCiudades() {
        for (Map.Entry<Integer,String> entry : cities.entrySet()) {
            System.out.print("\nCiudad: " + entry.getValue() + "\tZip Code: " + entry.getKey());
        }
    }
}
