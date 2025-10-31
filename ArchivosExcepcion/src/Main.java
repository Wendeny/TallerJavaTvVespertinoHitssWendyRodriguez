import excepcion.NombreInvalidoException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Path ruta = Paths.get("usuarios.txt");

        try {
            List<String> usuarios = Files.readAllLines(ruta);


            for (String linea : usuarios) {
                try {
                    validarNombre(linea);
                    System.out.println("Nombre valido: " + linea);
                }catch (NombreInvalidoException e){
                    System.out.println("Error - " + e.getMessage());
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo - " + e.getMessage());
        }

    }

    public static void validarNombre(String texto) throws NombreInvalidoException {
        if (texto == null || texto.trim().length() < 3) {
            throw new NombreInvalidoException("El nombre '" + texto + "' es inválido (mínimo 3 caracteres).");
        }
    }
}