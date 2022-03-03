package examen;

import java.util.ArrayList;

/**
 * PRE:
 * POST: Creo el objeto jugador con todos sus atributos
 */

public class Jugador {
    private String nombre;
    private Integer dorsal;
    private Integer potencia_disparo;
    private Integer habilidad_portero;
    private Integer vidas;

    public Jugador(String nombre, Integer dorsal, Integer potencia_disparo, Integer habilidad_portero, Integer vidas) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.potencia_disparo = potencia_disparo;
        this.habilidad_portero = habilidad_portero;
        this.vidas = 2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Integer getPotencia_disparo() {
        return potencia_disparo;
    }

    public void setPotencia_disparo(Integer potencia_disparo) {
        this.potencia_disparo = potencia_disparo;
    }

    public Integer getHabilidad_portero() {
        return habilidad_portero;
    }

    public void setHabilidad_portero(Integer habilidad_portero) {
        this.habilidad_portero = habilidad_portero;
    }

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public static void habilidadDisparo(Integer potencia_disparo){


    }

    public static void habilidadPorteria(Integer habilidad_portero){

    }

    public static void vidas(ArrayList<Jugador>  jugadores){


    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", potencia_disparo=" + potencia_disparo +
                ", habilidad_portero=" + habilidad_portero +
                ", vidas=" + vidas +
                '}';
    }
}
