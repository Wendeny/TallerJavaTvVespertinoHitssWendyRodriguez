public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sur africa", 5, 7.5, 190,
                "Panthera Leo", 3, 80, 15, 114);

        Mamifero guepardo = new Guepardo("Africa", 64, 1.1, 21,
                "Acinonyx jubatus", 2, 130);

        Mamifero tigre = new Tigre("Selva tropical", 122, 2.8, 65,
                "Panthera Tigris", 10, 65, "Grandes felinos asiáticos");

        Mamifero lobo = new Lobo("Bosque templado", 80, 1, 23,
                "Canis Lupus", "Gris y marron", 6, 4, "Lobo gris");

        Mamifero perro = new Perro("Hogar humano", 110, 50, 26,
                "Canis lupus familiaris", "Blanco y negro", 4, 700);

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero);
            System.out.println("------------------ DETALLES ------------------");
            System.out.println("Como duerme: [" + mamifero.dormir() + "]");
            System.out.println("Como come: [" + mamifero.comer() + "]");
            System.out.println("Como se comunica: [" + mamifero.comunicarse() + "]");
            System.out.println("Como corre: [" + mamifero.correr() + "]");
            System.out.println();
        }

    }
}