import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Billetera miBilletera = new Billetera(50);
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        int opcion;

        do {
            System.out.println("\n===== MI BILLETERA JAVA =====");
            System.out.println("1. Registrar Ingreso");
            System.out.println("2. Registrar Gasto");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Ver Historial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Monto del ingreso: $");
                    double ingreso = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Descripción: ");
                    String descIngreso = teclado.nextLine();
                    if (miBilletera.registrarIngreso(ingreso, descIngreso)) {
                        System.out.println("✅ Ingreso registrado correctamente.");
                    } else {
                        System.out.println("❌ No se pudo registrar el ingreso.");
                    }
                    break;

                case 2:
                    System.out.print("Monto del gasto: $");
                    double gasto = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Descripción: ");
                    String descGasto = teclado.nextLine();
                    if (miBilletera.registrarGasto(gasto, descGasto)) {
                        System.out.println("✅ Gasto registrado correctamente.");
                    } else {
                        System.out.println("❌ Saldo insuficiente o monto inválido.");
                    }
                    break;

                case 3:
                    System.out.println("💰 Saldo disponible: $" + formato.format(miBilletera.getSaldo()));
                    break;

                case 4:
                    miBilletera.mostrarMovimientos();
                    break;

                case 5:
                    System.out.println("👋 Gracias por usar Mi Billetera Java. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 5);

        teclado.close();
    }
}