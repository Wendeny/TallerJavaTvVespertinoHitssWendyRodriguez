package Ejercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseCajero {
    public static void main(String[] args){
        int menu = 0, cantVentas = 0;
        double precio, totalVenta = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\n╭┄┄┄┄┄┄┄╯");
            System.out.println("\n┇ \uD80C\uDFCF\uD80C\uDFCF   ◟   \uD834\uDD1E \uD80C\uDFEB    Lumiere  ／  BIENVENIDO");
            System.out.println("\n╰┄┄┄┄┄┄┄┄┄┄┄┄┄┄╮");

            System.out.println("\n  °❀⋆.ೃ࿔:･°❀⋆.ೃ࿔:･");
            System.out.println("౨ৎ    e  @   —   M E N U   !  ");
            System.out.println("┇    ⌇⌦ 1  Registrar pedido.");
            System.out.println("┇    ⌇⌦ 2  Mostrar total de ventas.");
            System.out.println("┇    ⌇⌦ 3  Salir.");
            System.out.print("       ↳ ⸝⸝⸝Ingrese el numero = ");



            if (!entrada.hasNextInt()) {
                System.out.println("❌ ERROR - Ingrese un numero valido.");
                entrada.next();
                continue;
            }
            menu = entrada.nextInt();

            if (menu <= 0 || menu >= 4) {
                System.out.println("❌ ERROR - Fuera de rango.");
                continue;
            }

            switch (menu){
                case 1:
                    System.out.print("\n⊹₊꒷︶︶ Ingrese el precio del pedido: $");

                    if (!entrada.hasNextDouble()){
                        System.out.println("❌ ERROR: Debe ingresar un número válido para el precio.");
                        entrada.next();
                        break;
                    }

                    precio = entrada.nextDouble();

                    if (precio < 0){
                        System.out.println("❌ ERROR: El precio debe ser mayor a 0.");
                    }else{
                        totalVenta += precio;
                        cantVentas++;
                    }
                    break;

                case 2:
                    DecimalFormat df = new DecimalFormat( "#,###.00");
                    System.out.println("\n\n⊹₊꒷︶︶꒷︶︶꒷꒦︶︶꒦‧₊˚⊹︰");
                    System.out.println("୨ ╰ ✦ Total de ventas: " + df.format(totalVenta));
                    System.out.println("୨ ╰ ✦ Cantidad vendida: " + cantVentas);
                    break;

                case 3:
                    System.out.println("୨୧ ៸៸ Goodbye. . .꒷꒦");
                    break;
            }

        }while (menu != 3);

    }
}
