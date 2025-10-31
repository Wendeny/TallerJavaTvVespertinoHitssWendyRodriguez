import clases.Empleado;
import clases.Evaluacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado(1, "Ana Gomez", "IT", 75000, 6,
                        Arrays.asList(new Evaluacion(2023, 93), new Evaluacion(2024, 95))),
                new Empleado(2, "Luis Vera", "Marketing", 55000, 4,
                        Arrays.asList(new Evaluacion(2023, 95), new Evaluacion(2024, 88))),
                new Empleado(3, "Carlos Sanchez", "IT", 92000, 8,
                        Arrays.asList(new Evaluacion(2023, 98), new Evaluacion(2024, 91))),
                new Empleado(4, "Laura Torres", "Ventas", 48000, 3,
                        Arrays.asList(new Evaluacion(2023, 78), new Evaluacion(2024, 82))),
                new Empleado(5, "Pedro Ramirez", "IT", 68000, 5,
                        Arrays.asList(new Evaluacion(2023, 98), new Evaluacion(2024, 85))),
                new Empleado(6, "Sofia Cas", "Marketing", 62000, 7,
                        Arrays.asList(new Evaluacion(2023, 95), new Evaluacion(2024, 97))),
                new Empleado(7, "Javier Ortiz", "Ventas", 85000, 10,
                        Arrays.asList(new Evaluacion(2023, 91), new Evaluacion(2024, 90)))
        );

        //Listar por departamento especifico
        System.out.println("↳ ⸝⸝⸝Empleados del departamento de IT.");
        empleados.stream()
                .filter(e -> "IT".equals(e.getDepartamento()))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(System.out::println);
        System.out.println("\n---------------------------------------------\n");

        //Calcular el salario promedio por departamento
        System.out.println("↳ ⸝⸝⸝Salario promedio por departamento.");
        Map<String, Double> salarioPromDpto = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.averagingDouble(Empleado::getSalario)
                ));
        salarioPromDpto.forEach((depto, prom) -> System.out.printf("%s: $%,.2f\n", depto, prom));
        System.out.println("\n---------------------------------------------\n");

        //Obtener el empleado con mayoe salario
        System.out.println("↳ ⸝⸝⸝Empleado con mayor salario.");
        empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario))
                .ifPresent(e -> System.out.println("El empleado con mayor salario: " + e));
        System.out.println("\n---------------------------------------------\n");

        //Listado de todos los empleados con más de 5 años de exp y salario mayor a 50000
        System.out.println("↳ ⸝⸝⸝Empleados con > 5 años de experiencia y salario > 50000.");
        empleados.stream()
                .filter(e -> e.getAñosDeExperiencia() > 5 && e.getSalario() > 50000)
                .forEach(System.out::println);
        System.out.println("\n---------------------------------------------\n");

        //Top de empleados con el mejor puntaje de la ultima evaliacion
        System.out.println("↳ ⸝⸝⸝Top 3 Empleados con la mejor última evaluación.");
        empleados.stream()
                .sorted(Comparator.comparingInt((Empleado e) -> e.getUltimaEvaluacion().map(Evaluacion::getPuntaje).orElse(0)).reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getNombre() + " - Puntaje: " + e.getUltimaEvaluacion().get().getPuntaje()));
        System.out.println("\n---------------------------------------------\n");

        //Cuantos empleados tienen al menos una evaluacion superior a 90
        System.out.println("↳ ⸝⸝⸝Empleados con alguna evaluacion superior a 90.");
        long conteo = empleados.stream()
                .filter(e -> e.getUltimaEvaluacion().stream().anyMatch(eval -> eval.getPuntaje() > 90))
                .count();
        System.out.println("Numero de empleados: " + conteo);
        System.out.println("\n---------------------------------------------\n");

        //Ranking de promedio de puntajes
        System.out.println("↳ ⸝⸝⸝Ranking de empleados por promedio de puntajes.");
        empleados.stream()
                .sorted(Comparator.comparingDouble(Empleado::getPromedioPuntaje).reversed())
                .forEach(e -> System.out.printf("%s - Promedio: %.2f\n", e.getNombre(), e.getPromedioPuntaje()));



    }
}