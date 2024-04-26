import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Array para almacenar los datos de los conciertos
    private static ArrayList<Concierto> conciertos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Agregar algunos conciertos de ejemplo
        //Luego completo con más datos
        conciertos.add(new Concierto("Escenario 1", "Zoo", "20:00"));
        conciertos.add(new Concierto("Escenario 2", "LA ÉLITE", "21:30"));
        conciertos.add(new Concierto("Escenario 3", "The Offspring", "23:00"));

        while (true) {
            //Mostrar las opciones del menú por pantalla
            System.out.println("Selecciona una de estas opciones: ");
            System.out.println("1. Lista de conciertos");
            System.out.println("2. Buscar información del concierto");
            System.out.println("3. Cerrar");

            //variable que almacena la selección del menú
            int opcion = scanner.nextInt();
            scanner.nextLine();

            //ejecución de cada caso
            switch (opcion) {
                case 1:
                    mostrarConciertos();
                    break;
                case 2:
                    buscarConcierto(scanner);
                    break;
                case 3:
                    System.out.println("Fin");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    /**
     *Muestra la lista de conciertos que se han almacenado en el array
     */
    private static void mostrarConciertos() {
        System.out.println("Lista de conciertos:");
        for (Concierto concierto : conciertos) {
            System.out.println("Escenario: " + concierto.getEscenario() + ", Artista: "
                    + concierto.getArtista() + ", Hora: " + concierto.getHora());
        }
        System.out.println();
    }

    /**
     * Método que busca un concierto en función del escenario, artista y hora
     * @param scanner El objeto scanner utilizado para leer la entrada del usuario
     */
    private static void buscarConcierto(Scanner scanner) {
        System.out.print("Introduzca el nombre del artista: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (Concierto concierto : conciertos) {
            //comprueba si el nombre del artista coincide con el que introduce el usuario
            if (concierto.getArtista().equalsIgnoreCase(nombre)) {
                System.out.println("Información del concierto:");
                System.out.println("Escenario: " + concierto.getEscenario());
                System.out.println("Artista: " + concierto.getArtista());
                System.out.println("Hora: " + concierto.getHora());
                encontrado = true;
                break;
            }
        }

        //si no se encuentra ningún concierto da un error, imprime un mensaje de error
        if (!encontrado) {
            System.out.println("El concierto no se encontró en la lista.");
        }
        System.out.println();
    }


}