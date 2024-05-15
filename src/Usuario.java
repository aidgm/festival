/**
 * Clase Usuario, representa a un usuario
 */
public class Usuario {
    private String nombre;

    /**
     * constructor de la clase usuario
     * @param nombre usuario
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtiene el nombre del usuario
     * @return nombre usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * establece el nombre del usuario
     * @param nombre nombre usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
