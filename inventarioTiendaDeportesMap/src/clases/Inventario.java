package clases;

import java.util.*;

public class Inventario {
    private Map<String, Producto> productosSKU;
    private LinkedHashMap<String, Producto> productosInsertados;
    private TreeSet<Producto> productosOrdenados;

    public Inventario(){
        productosSKU = new HashMap<>();
        productosInsertados = new LinkedHashMap<>();
        productosOrdenados = new TreeSet<>(Comparator.comparing(Producto::getNombre));
    }

    //Registrarlos
    public void registrarProducto(Producto p){
        if (productosSKU.containsKey(p.getSKU())){
            System.out.println("Ya existe un producto con el SKU: " + p.getSKU());
            return;
        }

        productosSKU.put(p.getSKU(), p);
        productosInsertados.put(p.getSKU(), p);
        productosOrdenados.add(p);
        System.out.println("Producto registrado: " + p);
    }

    //Consultar
    public Producto buscarSKU(String sku){
        return productosSKU.get(sku);
    }

    //Reporte ------ Ordenado por insercion
    public void reporteInsercion(){
        System.out.println("\nReporte en orden de inserción.");
        for (Producto p : productosInsertados.values()) {
            System.out.println(p);
        }
    }

    //Reporte ----- Ordenado alfabeticamente
    public void reporteOrdenado(){
        System.out.println("\n Reporte en orden alfabetico.");
        for (Producto p : productosOrdenados) {
            System.out.println(p);
        }
    }

    //Actualizar
    public void actualizarStock(String sku, int cantidad){
        Producto p = productosSKU.get(sku);
        if (p != null){
            p.setStock(p.getStock() + cantidad);
            System.out.println(" - Stock Actualizado. " + p);
        } else {
            System.out.println("Producto con SKU " + sku + " no encontrado.");
        }
    }
}
