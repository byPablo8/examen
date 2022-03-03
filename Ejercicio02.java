package examen;

import java.io.File;
import java.util.Scanner;

public class Ejercicio02 {
    /**
     * PRE:
     * POST: Creo un metodo que me dice el numero de veces que lonngitud es igual que
     * @param longitud
     * @param file
     */

    public static void palabrasMasLargasQue(int longitud, File file) {
        try {
            int contador = 0;
            Scanner sc = new Scanner(file);
            String linea = sc.nextLine();
            String[] tabla = linea.split(" ");
            for (int i = 0; i < tabla.length; i++) {
                System.out.println(tabla[i].replaceAll(",", " ").replaceAll("\\.", " "));
                if (tabla[i].equalsIgnoreCase(String.valueOf(longitud))) {
                    contador++;
                }
            }
            System.out.println(contador);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        int longitud = 4;
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\textoExamen.txt");
        palabrasMasLargasQue(longitud,file);
    }
}
