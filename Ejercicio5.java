import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int operaciones = 0;

        while (true) {
            System.out.println("\n=== CAJERO AUTOMATICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            if (opcion >= 1 && opcion <= 3) {
                operaciones++;
                System.out.println("Operacion realizada");
            } else {
                System.out.println("Opcion incorrecta");
            }
        }

        System.out.println("Operaciones realizadas: " + operaciones);
        System.out.println("Sesion cerrada");

        sc.close();
    }
}