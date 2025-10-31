package clases;

import java.util.*;

public class Torneo {

    private Map<String, Set<Jugador>> deportes = new HashMap<>();

    public void registrarJugador(String deporte, Jugador jugador) {
        deportes.putIfAbsent(deporte, new LinkedHashSet<>());
        deportes.get(deporte).add(jugador);
    }

    public void mostrarJugadores(String deporte, String tipo){
        Set<Jugador> base = deportes.getOrDefault(deporte, new HashSet<>());

        switch (tipo){
            case "hash":
                System.out.println(new HashSet<>(base));
                break;
            case "linked":
                System.out.println(new LinkedHashSet<>(base));
                break;
            case "tree":
                System.out.println(new TreeSet<>(base));
                break;
        }
    }

    public boolean buscarJugador(String deporte, Jugador j){
        return deportes.getOrDefault(deporte, new HashSet<>()).contains(j);
    }

    public void eliminarJugador(String deporte, Jugador j){
        deportes.getOrDefault(deporte, new HashSet<>()).remove(j);
    }

    public int contarJugadores(String deporte){
        return deportes.getOrDefault(deporte, new HashSet<>()).size();
    }

    public Set<Jugador> fusionar(String d1, String d2){
        Set<Jugador> union = new HashSet<>(deportes.getOrDefault(d1, new HashSet<>()));
        union.addAll(deportes.getOrDefault(d2, new HashSet<>()));
        return union;
    }

    public Set<Jugador> interseccion(String d1, String d2){
        Set<Jugador> inter = new HashSet<>(deportes.getOrDefault(d1, new HashSet<>()));
        inter.retainAll(deportes.getOrDefault(d2, new HashSet<>()));
        return inter;
    }

    public void transferir(String origen, String destino, Jugador j){
        eliminarJugador(origen, j);
        registrarJugador(destino, j);
    }

    public Set<Jugador> ordenadosPorNombre(){
        Set<Jugador> todos = new TreeSet<>();
        for (Set<Jugador> s : deportes.values()) todos.addAll(s);
        return todos;
    }

    public Set<Jugador> ordenadosInscripcion(){
        Set<Jugador> todos = new LinkedHashSet<>();
        for (Set<Jugador> s : deportes.values()) todos.addAll(s);
        return todos;
    }

    public Set<Jugador> rankingPorID(){
        return new TreeSet<>(Comparator.comparing(Jugador::getId)){{
            for (Set<Jugador> s : deportes.values()) addAll(s);
        }};
    }
    public Set<Jugador> getJugadores(String deporte) {
        return deportes.getOrDefault(deporte, new HashSet<>());
    }
}
