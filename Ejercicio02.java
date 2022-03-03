package examen;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio02 {
    /**
     * PRE:
     * POST: Creo un metodo que me dice el numero de veces que lonngitud es igual que
     *
     * @param longitud
     * @param file
     */

    public static void palabrasMasLargasQue(int longitud, File file) {
        try {
            int contador = 0;
            String tamaño = "";
            Scanner sc = new Scanner(file);
            String linea = sc.nextLine();
            String[] tabla = linea.split(" ");
            for (int i = 0; i < tabla.length; i++) {
                tabla[i].replaceAll(",", " ").replaceAll("\\.", " ").
                        replaceAll("\"", " ").replaceAll("\\( ", " ").replaceAll("\\) ", " ");
                if (tabla[i] != " ") {
                    if (tabla[i].length() >= longitud) {
                        contador++;
                    }
                }
            }
            System.out.println("Hay "+ contador);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        int longitud = 4;
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\textoExamen.txt");
        palabrasMasLargasQue(longitud, file);
    }
}
