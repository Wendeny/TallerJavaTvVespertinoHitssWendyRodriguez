package clases;

public class Producto {
    private String SKU;
    private String nombre;
    private Categoria categoria;
    private int stock;

    public Producto(String SKU, String nombre, Categoria categoria, int stock) {
        this.SKU = SKU;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getSKU() {
        return SKU;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%s) - Stock: %d", SKU, nombre, categoria, stock);
    }
}
