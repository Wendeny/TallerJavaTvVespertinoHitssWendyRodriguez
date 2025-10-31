import clases.Categoria;
import clases.Inventario;
import clases.Producto;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.registrarProducto(new Producto("SKU001", "Balón Adidas", Categoria.FUTBOL, 20));
        inventario.registrarProducto(new Producto("SKU002", "Raqueta Wilson", Categoria.TENIS, 15));
        inventario.registrarProducto(new Producto("SKU003", "Playera Nike", Categoria.RUNNING, 50));
        inventario.registrarProducto(new Producto("SKU004", "Balón Spalding", Categoria.BALONCESTO, 10));

        System.out.println("\nBuscar producto SKU003");
        System.out.println(inventario.buscarSKU("SKU003"));

        inventario.reporteInsercion();
        inventario.reporteOrdenado();

        inventario.actualizarStock("SKU002", -3);
        inventario.actualizarStock("SKU005", 10);
    }
}