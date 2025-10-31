import clases.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SupermercadoServicio servicio = new SupermercadoServicio();

        Producto demo = servicio.productoDeMuestra.get();
        System.out.println("Producto generado: " + demo.getNombre() + " $" + demo.getPrecio());

        Producto p1 = new Producto(1, "Leche Lala 1Lt", 26, 10);
        Producto p2 = new Producto(2, "Pan Bimbo", 31, 12);
        Producto p3 = new Producto(3, "Suadero", 145, 3);

        Cliente c1 = new Cliente(1, "Carlos", "VIP");
        Empleado e1 = new Empleado(1, "Kevin", "Cajero");

        List<Producto> lista = Arrays.asList(p1, p2, p3);
        Venta v1 = new Venta(1, c1, e1, lista);

        double total = servicio.calcularTotal.apply(lista);
        v1.setTotal(total);

        servicio.imprimirVentas.accept(v1);

        for (Producto p : lista) {
            if (servicio.stockBajo.test(p)) {
                System.out.println("Stock bajo: " + p);
            }
        }

        servicio.aplicarDescuentazo.apply(p1);
        System.out.println("╰┄┄┄ Producto con descuento :" + p1);

        Producto caro = servicio.masCaro.apply(p2, p3);
        System.out.println("╰┄┄┄ Producto más caro: " + caro);

        System.out.println("Tiene descuento VIP? " + servicio.clienteConDescuentazo.test(c1, total));

        servicio.generarTicket.accept(c1, v1);

        servicio.notificarAlCliente.accept(c1, e1);
    }
}