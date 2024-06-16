import java.io.IOException;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) throws IOException, InterruptedException {
        //Entrada de datos
        Scanner sc = new Scanner(System.in);
        //"Diccionario" de divisas
        String[] divisasDisponibles = {"ARS","BOB","BRL","CLP","COP","USD","MXN"};
        String divisaBase = "", divisaAConvertir = "";
        double cantidadAConvertir = 0.0;
        ConsultarAPI cons = new ConsultarAPI();
        byte opcion = 1;

        do
        {
            for (int i = 0; i < 50; i++) {
                System.out.print("*");
            }
            System.out.println("\n\nSea bienvenido/a al conversor de monedas =)\n");
            for (int i = 0; i < 50; i++) {
                System.out.print("*");
            }
            do {
                if (opcion < 1 || opcion > 7)
                    System.out.println("Opcion incorrecta\n");


                System.out.println("\nSeleccione su divisa base:");
                mostrarMenu();
                opcion = sc.nextByte();

            } while (opcion < 1 && opcion > 7);

            divisaBase = divisasDisponibles[opcion - 1];

            do {
                if (opcion < 1 || opcion > 7)
                    System.out.println("Opcion incorrecta\n");


                System.out.println("\nSeleccione su divisa a convertir:");
                mostrarMenu();
                opcion = sc.nextByte();

            } while (opcion < 1 && opcion > 7);

            divisaAConvertir = divisasDisponibles[opcion - 1];

            System.out.println("¿Cuánto desea convertir?: ");
            cantidadAConvertir = sc.nextDouble();

            Cambio.calcularCambio(divisaBase,divisaAConvertir,cons.consultarCambio(divisaBase,divisaAConvertir),cantidadAConvertir);
            System.out.println("¿Desea hacer otra conversión? (s/n): ");
        } while (sc.next().equalsIgnoreCase("s"));

    }

    private static void mostrarMenu()
    {
        System.out.println("1.- ARS - Peso argentino");
        System.out.println("2.- BOB - Boliviano boliviano");
        System.out.println("3.- BRL - Real brasileño");
        System.out.println("4.- CLP - Peso chileno");
        System.out.println("5.- COP - Peso colombiano");
        System.out.println("6.- USD - Dólar estadounidense");
        System.out.println("7.- MXN - Peso mexicano");
        System.out.println("Seleccione la opcion: ");
    }
}
