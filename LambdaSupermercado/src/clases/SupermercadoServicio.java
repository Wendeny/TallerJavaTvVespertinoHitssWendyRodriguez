package clases;

import java.util.List;
import java.util.function.*;

public class SupermercadoServicio {
    //Filtra los productos si tiene un stock debajo de 5
        //Predicate recibe 1 producto y regresa el boolean
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    //Calcular el total
        //Function recibe la lista de Producto y devuelve un double
    public Function<List<Producto>, Double> calcularTotal = lista -> {
        double total = 0.0;
        for (Producto p : lista) {
            total += p.getPrecio();
        }
        return total;
    };

    //Imprimir
        //Consumer solo recibe pero no devuelve, asi que usa para immprimir
    public Consumer<Venta> imprimirVentas = v -> {
        System.out.println("------------ VENTA #" + v.getId() + " ------------");
        System.out.println("    ⌇⌦ CLIENTE: " + v.getCliente().getNombre());
        System.out.println("    ⌇⌦ EMPLEADO: " + v.getEmpleado().getNombre());
        System.out.println("    ⌇⌦ PRODUCTOS: ");
        v.getProductos().forEach(System.out::println);
        System.out.println("    ⌇⌦ TOTAL: $" + v.getTotal() + "\n");

    };

    //Producto de muestra
        //El supplier no recibe nada, solo devuelve el producto creado de prueba
    public Supplier<Producto> productoDeMuestra = () -> new Producto(999, "Producto Beta", 10.0, 100);

    //Aplicar descuento
        //Unary recibe y devuelve el mismo tipo, en donde aplica el descuento del 10%
    public UnaryOperator<Producto> aplicarDescuentazo = p -> {
        p.setPrecio(p.getPrecio() * 0.9);
        return p;
    };

    //Comparar los productos
        //Binary es parecido a Unary a diferencia de que este recibe dos y devuelve del mismo tipo
    public BinaryOperator<Producto> masCaro = (p1, p2) -> p1.getPrecio() >= p2.getPrecio() ? p1 : p2;

    //Descuento VIP
        // Bipredicate recibe dos y regresa un boolean
        //Recibe a cliente y el double de total, en donde el cliente se considera VIP si la compra supera 1000
    public BiPredicate<Cliente, Double> clienteConDescuentazo = (c, total) -> c.getTipo().equalsIgnoreCase("VIP") && total > 1000;

    //Tiocket de venta
        //BiConsumer recibe dos y no regresa nada, donde recible cliente y venta
    public BiConsumer<Cliente, Venta> generarTicket = (c, v) -> {
            System.out.println("  ↳ ⸝⸝⸝ Ticket para: " + c.getNombre());
            v.getProductos().forEach(p -> System.out.println(" - " + p));
            System.out.println("    ⌇⌦ TOTAL: $" + v.getTotal());
        };

    //Notificar al cliente
        //Al igual que el anterior este recibe al cliente y al empleado imprimiendo la notificacion
    public BiConsumer<Cliente, Empleado> notificarAlCliente = (c, e) ->
            System.out.println("Estimado " + c.getNombre() + ", su compra fue procesada por " + e.getNombre());;
}
