package clases;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private int id;
    private String nombre;
    private Set<Curso> cursos;

    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso c){
        cursos.add(c);
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", id, nombre);
    }
}
