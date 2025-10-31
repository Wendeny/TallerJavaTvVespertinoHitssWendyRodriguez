package Main;

import Genericos.Bolsa;
import Productos.Fruta;
import Productos.Lacteo;
import Productos.Limpieza;
import Productos.NoPerecible;

public class Main {
    public static void main(String[] args) {
        Bolsa<Fruta> frutaBolsa = new Bolsa<>();
        frutaBolsa.agregarProducto(new Fruta("Manzana", 27.6, 0.3, "Roja"));
        frutaBolsa.agregarProducto(new Fruta("Platano", 22.5, 0.5, "Amarillo"));
        frutaBolsa.agregarProducto(new Fruta("Uva", 30.2, 0.05, "Verde"));
        frutaBolsa.agregarProducto(new Fruta("Naranja", 16.6, 0.25, "Naranja"));
        frutaBolsa.agregarProducto(new Fruta("Pera", 28.4, 0.28, "Verde"));

        Bolsa<Lacteo> lacteoBolsa = new Bolsa<>();
        lacteoBolsa.agregarProducto(new Lacteo("Leche", 26.0, 1, 8));
        lacteoBolsa.agregarProducto(new Lacteo("Yogurt", 15.0, 2, 5));
        lacteoBolsa.agregarProducto(new Lacteo("Queso", 30.0, 1, 12));
        lacteoBolsa.agregarProducto(new Lacteo("Mantequilla", 26.3, 1, 3));
        lacteoBolsa.agregarProducto(new Lacteo("Crema", 26.0, 1, 4));

        Bolsa<Limpieza> limpiezaBolsa = new Bolsa<>();
        limpiezaBolsa.agregarProducto(new Limpieza("Cloro", 36.5, "Hipoclorito", 1.5));
        limpiezaBolsa.agregarProducto(new Limpieza("Jabon", 11.5, "Grasas", 0.5));
        limpiezaBolsa.agregarProducto(new Limpieza("Detergente", 30.6, "Quimicos", 1.0));
        limpiezaBolsa.agregarProducto(new Limpieza("Shampoo", 27.5, "Extracto", 0.75));
        limpiezaBolsa.agregarProducto(new Limpieza("Suavizante", 30.5, "Aroma", 1.2));

        Bolsa<NoPerecible> noPerecibleBolsa = new Bolsa<>();
        noPerecibleBolsa.agregarProducto(new NoPerecible("Atun", 18.0, 140, 250));
        noPerecibleBolsa.agregarProducto(new NoPerecible("Frijoles", 38.5, 900, 350));
        noPerecibleBolsa.agregarProducto(new NoPerecible("Lentejas", 28.0, 500, 300));
        noPerecibleBolsa.agregarProducto(new NoPerecible("Sopa", 16.5, 250, 100));
        noPerecibleBolsa.agregarProducto(new NoPerecible("Arroz", 35.0, 1000, 350));

        System.out.println("-------- Bolsa de Frutas --------");
        for (Fruta f : frutaBolsa.obtenerProductos()){
            System.out.println(f.getNombre() + " - $" + f.getPrecio() + " - Peso: " + f.getPeso() + " - Color: " + f.getColor());
        }

        System.out.println("\n-------- Bolsa de Lacteos --------");
        for (Lacteo l : lacteoBolsa.obtenerProductos()) {
            System.out.println(l.getNombre() + " - $" + l.getPrecio() +
                    " - Cantidad: " + l.getCantidad() + " - Proteínas: " + l.getProteina());
        }

        System.out.println("\n-------- Bolsa de Limpieza --------");
        for (Limpieza li : limpiezaBolsa.obtenerProductos()) {
            System.out.println(li.getNombre() + " - $" + li.getPrecio() +
                    " - Componentes: " + li.getComponentes() + " - Litros: " + li.getLitros());
        }

        System.out.println("\n-------- Bolsa de No Perecibles --------");
        for (NoPerecible np : noPerecibleBolsa.obtenerProductos()) {
            System.out.println(np.getNombre() + " - $" + np.getPrecio() +
                    " - Contenido: " + np.getContenido() + "g - Calorías: " + np.getCalorias());
        }

    }
}