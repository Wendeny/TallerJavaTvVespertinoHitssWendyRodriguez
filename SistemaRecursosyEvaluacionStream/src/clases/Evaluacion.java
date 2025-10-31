package clases;

public class Evaluacion {
    private int año;
    private int puntaje;

    public Evaluacion(int año, int puntaje) {
        this.año = año;
        this.puntaje = puntaje;
    }

    public int getAño() {
        return año;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Año: " + año +
                " | Puntaje: " + puntaje;
    }
}
