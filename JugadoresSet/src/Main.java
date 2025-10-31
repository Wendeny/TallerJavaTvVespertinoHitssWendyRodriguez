import clases.Jugador;
import clases.Torneo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        torneo.registrarJugador("Futbol", new Jugador(1, "Reina"));
        torneo.registrarJugador("Futbol", new Jugador(2, "Luis"));
        torneo.registrarJugador("Basquetbol", new Jugador(3, "Juana"));
        torneo.registrarJugador("Basquetbol", new Jugador(2, "Luis"));
        torneo.registrarJugador("Voleibol", new Jugador(4, "Pedro"));
        torneo.registrarJugador("Voleibol", new Jugador(5, "Maria"));

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("౨ৎ    e  @   —   M E N U   !  \n");
            System.out.println("┇    ⌇⌦ 1  Mostrar jugadores por deporte");
            System.out.println("┇    ⌇⌦ 2  Contar jugadores en cada disciplina");
            System.out.println("┇    ⌇⌦ 3  Fusionar equipos");
            System.out.println("┇    ⌇⌦ 4  Ver jugadores en común");
            System.out.println("┇    ⌇⌦ 5  Transferir jugador");
            System.out.println("┇    ⌇⌦ 6  Mostrar todos ordenados por nombre");
            System.out.println("┇    ⌇⌦ 7  Mostrar todos en orden de inscripción");
            System.out.println("┇    ⌇⌦ 8  Ranking de jugadores por ID");
            System.out.println("┇    ⌇⌦ 9  Salir");
            System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");

            opcion = sc.nextInt();
            int opcion2;
            int opcion3;

            switch (opcion){
                case 1:

                    System.out.println("┇    ↳ ⸝⸝⸝ Elige el deporte: ");
                    System.out.println("╰┄┄┄┄ ⌇⌦ 1  Futbol");
                    System.out.println("╰┄┄┄┄ ⌇⌦ 2  Basquetbol");
                    System.out.println("╰┄┄┄┄ ⌇⌦ 3  Voleibol");
                    System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                    opcion2 = sc.nextInt();

                    switch (opcion2){
                        case 1:
                            System.out.println("╰┄┄┄┄ ⌇⌦ 1  Sin ordenar");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 2  Orden por inscripción");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 3  Orden alfabetico");
                            System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                            opcion3 = sc.nextInt();

                            switch (opcion3){
                                case 1:
                                    System.out.println();
                                    torneo.mostrarJugadores("Futbol", "hash");
                                    break;
                                case 2:
                                    System.out.println();
                                    torneo.mostrarJugadores("Futbol", "linked");
                                    break;
                                case 3:
                                    System.out.println();
                                    torneo.mostrarJugadores("Futbol", "tree");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("╰┄┄┄┄ ⌇⌦ 1  Sin ordenar");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 2  Orden por inscripción");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 3  Orden alfabetico");
                            System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                            opcion3 = sc.nextInt();

                            switch (opcion3){
                                case 1:
                                    System.out.println();
                                    torneo.mostrarJugadores("Basquetbol", "hash");
                                    break;
                                case 2:
                                    System.out.println();
                                    torneo.mostrarJugadores("Basquetbol", "linked");
                                    break;
                                case 3:
                                    System.out.println();
                                    torneo.mostrarJugadores("Basquetbol", "tree");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("╰┄┄┄┄ ⌇⌦ 1  Sin ordenar");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 2  Orden por inscripción");
                            System.out.println("╰┄┄┄┄ ⌇⌦ 3  Orden alfabetico");
                            System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                            opcion3 = sc.nextInt();

                            switch (opcion3){
                                case 1:
                                    System.out.println();
                                    torneo.mostrarJugadores("Voleibol", "hash");
                                    break;
                                case 2:
                                    System.out.println();
                                    torneo.mostrarJugadores("Voleibol", "linked");
                                    break;
                                case 3:
                                    System.out.println();
                                    torneo.mostrarJugadores("Voleibol", "tree");
                                    break;
                            }
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Futbol: " + torneo.contarJugadores("Futbol"));
                    System.out.println("Basquetbol: " + torneo.contarJugadores("Basquetbol"));
                    System.out.println("Voleibol: " + torneo.contarJugadores("Voleibol"));
                    break;
                case 3:
                    System.out.println("┇   Elige el primer deporte: ");
                    System.out.println("╰┄┄┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Basquetbol | ⌇⌦ 3  Voleibol");
                    System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                    opcion2 = sc.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Basquetbol | ⌇⌦ 2  Voleibol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Union Fútbol + Basquetbol: " + torneo.fusionar("Futbol", "Basquetbol"));
                                    break;
                                case 2:
                                    System.out.println("Union Fútbol + Voleibol: " + torneo.fusionar("Futbol", "Voleibol"));
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Voleibol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Union Basquetbol + Futbol: " + torneo.fusionar("Basquetbol", "Futbol"));
                                    break;
                                case 2:
                                    System.out.println("Union Basquetbol + Voleibol: " + torneo.fusionar("Basquetbol", "Voleibol"));
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Basquetbol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Union Voleibol + Futbol: " + torneo.fusionar("Voleibol", "Futbol"));
                                    break;
                                case 2:
                                    System.out.println("Union Voleibol + Basquetbol: " + torneo.fusionar("Voleibol", "Basquetbol"));
                                    break;
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("┇   Elige el primer deporte: ");
                    System.out.println("╰┄┄┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Basquetbol | ⌇⌦ 3  Voleibol");
                    System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");
                    opcion2 = sc.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Basquetbol | ⌇⌦ 2  Voleibol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Comunes Fútbol + Basquetbol: " + torneo.interseccion("Futbol", "Basquetbol"));
                                    break;
                                case 2:
                                    System.out.println("Comunes Fútbol + Voleibol: " + torneo.interseccion("Futbol", "Voleibol"));
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Voleibol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Comunes Basquetbol + Futbol: " + torneo.interseccion("Basquetbol", "Futbol"));
                                    break;
                                case 2:
                                    System.out.println("Comunes Basquetbol + Voleibol: " + torneo.interseccion("Basquetbol", "Voleibol"));
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("┇   Elige el segundo deporte: ");
                            System.out.println("╰┄┄ ⌇⌦ 1  Futbol | ⌇⌦ 2  Basquetbol");
                            opcion3 = sc.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Comunes Voleibol + Futbol: " + torneo.interseccion("Voleibol", "Futbol"));
                                    break;
                                case 2:
                                    System.out.println("Comunes Voleibol + Basquetbol: " + torneo.interseccion("Voleibol", "Basquetbol"));
                                    break;
                            }
                            break;
                    }

                    break;
                case 5:
                    System.out.print("┇   De qué deporte quieres transferir?: ");
                    sc.nextLine(); // limpiar buffer
                    String origen = sc.nextLine();

                    System.out.print("┇   A qué deporte quieres transferir?: ");
                    String destino = sc.nextLine();

                    System.out.print("┇   Escribe el ID del jugador a transferir: ");
                    int id = sc.nextInt();

                    Jugador jugadorEncontrado = null;
                    for (Jugador j : torneo.getJugadores(origen)) {
                        if (j.getId() == id) {
                            jugadorEncontrado = j;
                            break;
                        }
                    }

                    if (jugadorEncontrado != null) {
                        torneo.transferir(origen, destino, jugadorEncontrado);
                        System.out.println("Jugador transferido con éxito.");
                    } else {
                        System.out.println("No se encontró jugador con ese ID en " + origen);
                    }
                    break;
                case 6:
                    System.out.println(torneo.ordenadosPorNombre());
                    break;
                case 7:
                    System.out.println(torneo.ordenadosInscripcion());
                    break;
                case 8:
                    System.out.println(torneo.rankingPorID());
                    break;
            }
        } while (opcion != 9);
    }
}