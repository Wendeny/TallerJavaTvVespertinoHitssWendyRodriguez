package clases;

import java.util.Objects;

public class Jugador  implements Comparable<Jugador>{
    private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("[%d) %s", id, nombre);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);
    }
}
