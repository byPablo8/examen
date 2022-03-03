package examen;

import java.io.File;
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
        int contador = 0;
        try {
            Scanner f = new Scanner(file);
            String linea = f.nextLine();
            String[] tabla = linea.split(" ");

            //// REMPLAZO TODOS ESTOS CARACTERS////

            for (int i = 0; i < tabla.length; i++) {
                tabla[i].replaceAll(",", "").replaceAll("\\.", "").
                        replaceAll("\"", "").replaceAll("\\( ", "").
                        replaceAll("\\) ", "").replaceAll(":", "");
            }

            //// SI LA PALABRA ES MAYOR IGUAL QUE LA LONGITUD CONTADOR ++ ////

            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] != " ") {
                    if (tabla[i].length() >= longitud) {
                        contador++;
                    }
                }
            }
            System.out.println("Hay estas palabras mayores o iguales: " + contador);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Dado el fichero “textoExamen.txt”, implementa un método
     * palabrasMasLargasQue(int longitud) el cual devuelve un entero indicando el número de
     * palabras del texto cuya longitud es mayor o igual que [longitud].
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\textoExamen.txt");
        System.out.println("Introduce un numero: ");
        longitud = sc.nextInt();
        palabrasMasLargasQue(longitud, file);
    }
}
