import interfaz.Analizador;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Analizador masRepetido = frase -> {
            String[] palabras = frase.toLowerCase().split("\\s+");

            Map<String, Long> conteo = Arrays.stream(palabras). collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            Map.Entry<String, Long> max = conteo.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

            Map<String, Integer> resultado = new HashMap<>();
            resultado.put(max.getKey(), max.getValue().intValue());

            return resultado;
        };

        String frase = "Hola mundo hola java hola curso hola esto es una frase";
        Map<String, Integer> resultado = masRepetido.aplicar(frase);

        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println("Palabra más repetida -> '" + entry.getKey() + "' veces [" + entry.getValue() + ']');
        }
        System.out.println("Frase -> [[" + frase + "]]");
    }
}