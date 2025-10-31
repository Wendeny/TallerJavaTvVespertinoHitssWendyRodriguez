package interfaz;

import java.util.Map;

@FunctionalInterface
public interface Analizador {
    Map<String, Integer> aplicar(String frase);
}
