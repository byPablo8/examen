package examen;

import java.io.File;
import java.util.*;

public class Ejercicio03 {

    /**
     * pre:
     * post: Este metodo busca las consolas disponibles para cada juego
     *
     * @param file
     */

    public static void informacionVideojuegos(File file) {
        try {
            Scanner f = new Scanner(file);
            ArrayList<String> consolas = new ArrayList<>();
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                String[] tabla = linea.split(",");
                consolas.add(tabla[2]);
            }
            /**
             * PRE
             * POST: Este proceso me permite borrar todos los elementos repetidos asi podre saber las consolas
             * diferentes.
             */
            Set<String> hashSet = new HashSet<String>(consolas);
            consolas.clear();
            consolas.addAll(hashSet);
            for (String s : consolas) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    /**
     * pre:
     * post: Implementa un método informacionVideojuegos() que devuelve un ArrayList<String> que
     * agrupe todas las plataformas para las que hay videojuegos en el fichero entregado. Es
     * decir, se debe almacenar UNA SOLA VEZ, cada una de las plataformas que aparecen en
     * el fichero .csv.
     * @param args
     */

    public static void main(String[] args) {
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\ventasVideojuegos.csv");
        informacionVideojuegos(file);
    }
}
