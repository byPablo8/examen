package examen;

import ligaEquipos.Equipo;

import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {


        Jugador j1 = new Jugador("Pablo", 8, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j2 = new Jugador("Pablo", 9, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j3 = new Jugador("Pablo", 10, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j4 = new Jugador("Pablo", 2, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j5 = new Jugador("Pablo", 3, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j6 = new Jugador("Pablo", 7, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j7 = new Jugador("Pablo", 2, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j8 = new Jugador("Pablo", 0, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j9 = new Jugador("Pablo", 20, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);
        Jugador j10 = new Jugador("Pablo", 30, (int) (Math.random() * 10), (int) (Math.random() * 10), 2);

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        jugadores.add(j5);
        jugadores.add(j6);
        jugadores.add(j7);
        jugadores.add(j8);
        jugadores.add(j9);
        jugadores.add(j10);

        int contador_vidas = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            if (j1.getVidas() < 0) {
                contador_vidas++;
            }
            if (j2.getVidas() < 0) {
                contador_vidas++;
            }
            if (j3.getVidas() < 0) {
                contador_vidas++;
            }
            if (j4.getVidas() < 0) {
                contador_vidas++;
            }
            if (j5.getVidas() < 0) {
                contador_vidas++;
            }
            if (j6.getVidas() < 0) {
                contador_vidas++;
            }
            if (j7.getVidas() < 0) {
                contador_vidas++;
            }
            if (j8.getVidas() < 0) {
                contador_vidas++;
            }
            if (j9.getVidas() < 0) {
                contador_vidas++;
            }
            if (j10.getVidas() < 0) {
                contador_vidas++;
            }
        }
    }

}
