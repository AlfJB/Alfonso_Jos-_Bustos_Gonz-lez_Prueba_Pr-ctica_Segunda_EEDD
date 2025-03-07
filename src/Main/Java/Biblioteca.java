package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    /**@param List<Libro> libros: se trata de un arrayList.
     *
     */
    /
    private final List<Libro> libros;

    /**
     * @param Biblioteca: Objeto de clase el cuál es un arrayList de libros
     * Creamos un nuevo arrayList de libros con el que empezaremos a trabajar.
     */

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
    *El arrayList Biblioteca toma un nuevo objeto libro, siendo libros una lista.
     * @param this.libros: usado para poder acceder al objeto privado libros
    *
    */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
    *
    *Pasamos el objeto List el cual pide un libro con el get a los existentes en el método,
     * dando como resultado un retorno del libro llamado.
    *
    */

    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * El método busca un objeto libro hacicendo una llamada al objeto privado título.
     * En caso de introducir un título existente en nuestra base de datos nos retornará un objeto
     * libro con ese nombre. En caso de no existir dicho título nos dará un valor null.
     *
     */
    /

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     *Método anteriormente utilizado, actualmente sin uso. Realizaba una búsqueda del objeto libro a través
     * de su autor. Hacía una llamada al nombre del autor y en caso de existir un libro relacionado a ese nombre
     * nos lo retorna, en caso contrario nos da un valor null.
     *
     *
     */
    /

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     *Método relacionado con el anterior, actualmente válido.
     * Del mismo modo que el anterior, hace una llamada al objeto autor para relacionarlo con un arrays de
     * libros de forma que en caso de que encuentre algún libro de dicho autor se acumulen en el array
     * que crea el método.
     */
    /

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
