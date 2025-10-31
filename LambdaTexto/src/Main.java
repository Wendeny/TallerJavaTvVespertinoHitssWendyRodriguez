import interfaz.Transformador;

public class Main {
    public static void main(String[] args) {
        /*
        Expresión Lambda que elimine espacios, comas y puntos de una frase
        y además la devuelva la frase convertida en mayúscula.
         */

        Transformador limpiar = frase -> frase.replaceAll("[ ,.]", "").toUpperCase();

        String original = "Esto es un texto, no un comentario. a,b.c.,d.,e,f..g,";
        String resul = limpiar.aplicar(original);

        System.out.println("Original -> [" + original + ']');
        System.out.println("Transformado -> [" + resul + ']');
    }
}