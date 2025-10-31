package clases;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SistemaUniversitario {
    private Map<String, Curso> cursos;
    private Map<Integer, Estudiante> estudiantes;
    private Map<Integer, Profesor> profesores;

    public SistemaUniversitario() {
        cursos = new HashMap<>();
        estudiantes = new HashMap<>();
        profesores = new HashMap<>();
    }

    public void registrarCurso(Curso curso){
        cursos.put(curso.getNombre(), curso);
    }

    public void registrarEstudiante(Estudiante e) {
        estudiantes.put(e.getId(), e);
    }

    public void registrarProfesor(Profesor p) {
        profesores.put(p.getId(), p);
    }

    //Inscribir estudiante (validar)
    public boolean inscribir(int idEstudiante, String nombreCurso) {
        Estudiante e = estudiantes.get(idEstudiante);
        Curso curso = cursos.get(nombreCurso);

        if (e == null || curso == null) return false;

        //Fechas
        for (Curso c : cursos.values()) {
            if (c.getEstudiantes().contains(e)) {
                if (solapanFechas(c, curso)) {
                    System.out.println("Conflicto de horarios: " +c.getNombre());
                    return false;
                }
            }
        }

        curso.agregarEstudiante(e);
        return true;

    }

    //retirar estudiante
    public boolean retirar(int idEstudiante, String nombreCurso) {
        Estudiante e = estudiantes.get(idEstudiante);
        Curso curso = cursos.get(nombreCurso);

        if (e == null || curso == null) return  false;
        return curso.eliminarEstudiante(e);
    }

    //listar cursos de un estudiante
    public void listarCursosEstudiante(int idEstudiante) {
        Estudiante e = estudiantes.get(idEstudiante);
        if (e == null) return;

        System.out.println("Cursos de " + e.getNombre() + ":");
        for (Curso c : cursos.values()) {
            if (c.getEstudiantes().contains(e)) {
                System.out.println(" - " + c);
            }
        }
    }

    //listar cursos de profe
    public void listarCursosProfesor(int idProfesor) {
        Profesor p = profesores.get(idProfesor);
        if (p == null) return;
        System.out.println("Cursos de " + p.getNombre() + ":");
    }

    // listar cursos activos en una fecha
    public void listarCursosActivos (LocalDate fecha) {
        System.out.println("Cursos activos: " + fecha + ":");
        for (Curso c : cursos.values()) {
            if (c.estaActivo(fecha)){
                System.out.println(" - " + c);
            }
        }
    }

    private boolean solapanFechas(Curso a, Curso b){
        return !(a.getFin().isBefore(b.getInicio()) || a.getInicio().isAfter(b.getFin()));
    }

}
