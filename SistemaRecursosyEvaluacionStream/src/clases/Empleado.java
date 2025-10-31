package clases;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private int añosDeExperiencia;
    private List<Evaluacion> evaluaciones;

    public Empleado(int id, String nombre, String departamento, double salario, int añosDeExperiencia, List<Evaluacion> evaluaciones) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.añosDeExperiencia = añosDeExperiencia;
        this.evaluaciones = evaluaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public Optional<Evaluacion> getUltimaEvaluacion() {
        return evaluaciones.stream()
                .max(Comparator.comparingInt(Evaluacion::getAño));
    }

    public double getPromedioPuntaje() {
        OptionalDouble promedio = evaluaciones.stream()
                .mapToInt(Evaluacion::getPuntaje)
                .average();
        return promedio.orElse(0.0);
    }

    @Override
    public String toString() {
        return "Empleado #" + id +
                " - " + nombre + '\'' +
                " | Departamento: " + departamento + '\'' +
                " | Salario: " + salario +
                " | Años de experiencia: " + añosDeExperiencia +
                "\n Evaluación: " + evaluaciones;
    }
}
