package biblioteca;

public class Libro {
    /**@autor: ALFONSO JOSÉ BUSTOS GONZÁLEZ
     * @param título: el título del libro
     * @param autor: el autor el libro
     * @param anioPublicacion: fecha en la que se publicó el libro
     */

    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Inicializamos el método Libro de forma que obtenemos los atributos con getter y setter
     * siendo en este caso el atributo título el utilizado. Usamos get y set para poder acceder
     * a título al ser este un atributo privado.
     * @param get: traemos el atributo mencionado, en este caso título
     * @param set: introducimos el atributo mencionado, en este caso título
     */

    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Este método nos permite acceder al atributo privado autor de forma que así podamos hacer una llamada.
     *  @param get: traemos el atributo mencionado, en este caso autor
     *  @param set: introducimos el atributo mencionado, en este caso autor
     *
     */


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Este método nos permite acceder al atributo privado autor de forma que así podamos hacer una llamada.
     *  @param get: traemos el atributo mencionado, en este caso anioPublicacion
     *  @param set: introducimos el atributo mencionado, en este caso anioPublicación
     *
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
