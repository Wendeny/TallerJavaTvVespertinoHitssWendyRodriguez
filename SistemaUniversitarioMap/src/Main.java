import clases.Curso;
import clases.Estudiante;
import clases.Profesor;
import clases.SistemaUniversitario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaUniversitario sistema = new SistemaUniversitario();

        Profesor p1 = new Profesor(1, "Dr. López");
        Profesor p2 = new Profesor(2, "Ing. Pérez");

        sistema.registrarProfesor(p1);
        sistema.registrarProfesor(p2);

        Estudiante e1 = new Estudiante(101, "Ana");
        Estudiante e2 = new Estudiante(102, "Luis");

        sistema.registrarEstudiante(e1);
        sistema.registrarEstudiante(e2);

        Curso c1 = new Curso("Matemáticas", p1, LocalDate.of(2025, 1, 10), LocalDate.of(2025, 3, 10));
        Curso c2 = new Curso("Programación", p2, LocalDate.of(2025, 2, 15), LocalDate.of(2025, 4, 15));

        sistema.registrarCurso(c1);
        sistema.registrarCurso(c2);

        sistema.inscribir(101, "Matemáticas"); // ✅
        sistema.inscribir(101, "Programación"); // ❌ conflicto
        sistema.inscribir(102, "Programación"); // ✅

        sistema.listarCursosEstudiante(101);
        sistema.listarCursosProfesor(2);
        sistema.listarCursosActivos(LocalDate.of(2025, 2, 20));
    }
}