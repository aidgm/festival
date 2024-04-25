public class Concierto {
    private String escenario;
    private String artista;
    private int hora;


    /**
     * constructor de la clase concierto
     * @param escenario Nombre del escenario
     * @param artista Nombre del artista o banda
     * @param hora Hora a la que sería el concierto
     */
    public Concierto(String escenario, String artista, int hora) {
        this.escenario = escenario;
        this.artista = artista;
        this.hora = hora;
    }

    /**
     * Obtiene el nombre del escenario en el que se celebra el concierto
     * @return el nombre del escenario
     */
    public String getEscenario() {
        return escenario;
    }

    /**
     * Establece el nombre del escenario
     * @param escenario
     */
    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    /**
     * Obtiene el nombre del artista o banda de ese concierto
     * @return el nombre del artista o banda
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el nombre del artista o banda
     * @param artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene la hora de inicio del concierto
     * @return la hora del inicio del concierto
     */
    public int getHora() {
        return hora;
    }

    /**
     * Establece la hora del concierto
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Devuelve en forma de cadena el objeto concierto
     * @return una cadena del objeto concierto
     */
    @Override
    public String toString() {
        return "Concierto{" +
                "escenario='" + escenario + '\'' +
                ", artista='" + artista + '\'' +
                ", hora=" + hora +
                '}';
    }
}
