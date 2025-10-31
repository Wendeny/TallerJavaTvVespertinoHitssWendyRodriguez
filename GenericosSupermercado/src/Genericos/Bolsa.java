package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T>{
    private List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public List<T> obtenerProductos() {
        return productos;
    }

}
