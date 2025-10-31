public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Ana", "Perez", "AF123", "CDMX", 50000, 200000);
        System.out.println(g1);

        g1.aumentarRemuneracion(10);
        g1.setPresupuesto(250000);

        System.out.println("Despues de ajustes: ");
        System.out.println(g1);

        Cliente c1 = new Cliente("Luis", "Ramirez", "BF456", "Monterrey", 101);
        System.out.println(c1);
    }
}