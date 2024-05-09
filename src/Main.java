import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Array para almacenar los datos de los conciertos
    private static ArrayList<Concierto> conciertos = new ArrayList<>();
    //Array para almacenar los nombres de usuarios
    private static ArrayList<String> usuariosRegistrados = new ArrayList<>();
    private static String nombreUsuario;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Agregar algunos conciertos de ejemplo
        conciertos.add(new Concierto("Escenario 1", "Zoo", "20:00"));
        conciertos.add(new Concierto("Escenario 2", "LA ÉLITE", "21:30"));
        conciertos.add(new Concierto("Escenario 3", "The Offspring", "23:00"));

        System.out.println("Hola!! Introduce tu usuario");
        nombreUsuario= scanner.nextLine();

        //comprobar si el usuario está registrado
        if (!usuariosRegistrados.contains(nombreUsuario)){
            System.out.println("El usuario no está registrado.");
            registrarUsuario(scanner);
        }

        boolean continuar = true;


        while (continuar) {
            mostrarMenu();

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
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
            //si la opcion seleccionada es la 3, sale directamente
            if (opcion == 3){
                continuar = false;
            }else{
                //se pregunta al usuario si quiere continuar
                continuar = continuarMenu(scanner);
            }

        }
        System.out.println("Fin");
    }

    /**
     * método para registrar a un nuevo usuario
     * @param scanner
     */

    private static void registrarUsuario(Scanner scanner){
        System.out.println("Regístrate introduciendo el nombre de usuario que quieras");
        nombreUsuario = scanner.nextLine();
        usuariosRegistrados.add(nombreUsuario);
    }

    /**
     *
     */
    private static void mostrarMenu(){
        System.out.println("\nSelecciona una opción: ");
        System.out.println("1. Lista completa de conciertos ");
        System.out.println("2. Informacion de un concierto ");
        System.out.println("3. Cerrar programa ");
    }

    /**
     *
     * @param scanner
     * @return
     */
    private static boolean continuarMenu(Scanner scanner){
        System.out.println("¿Quieres continuar? Marca S/N");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("S");
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