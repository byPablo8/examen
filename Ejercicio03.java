package examen;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio03 {
    public static void informacionVideojuegos(File file){
        try {
            Scanner f = new Scanner(file);
            ArrayList<String> consolas = new ArrayList<>();
            while (f.hasNextLine()){
                String linea = f.nextLine();
                String[] tabla = linea.split(";");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\ventasVideojuegos.csv");
    }
}
