import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Mostrar las opciones del menú por pantalla
            System.out.print("Selecciona una de estas opciones: ");
            System.out.println("1. Lista de conciertos");
            System.out.println("2. Buscar información del concierto");
            System.out.println("3. Cerrar");

            //variable que almacena la selección del menú
            int opcion = scanner.nextInt();
            scanner.nextLine();

            //ejecución de cada caso
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Fin");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}