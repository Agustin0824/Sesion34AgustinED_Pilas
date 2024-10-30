
package sesion35agustinED_pila2;


public class Libro {//inicia clase
    //atributos libro
    private String autor;
    private String titulo;
    private int anio;
    private String editorial;
    
    //constructor vacio 
    public Libro() {
        this.autor = "";
        this.titulo = "";
        this.anio = 0;
        this.editorial = "";
    }//termina constructor vacio
    
    //constructor que pasa parametros

    public Libro(String autor, String titulo, int anio, String editorial) {
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.editorial = editorial;
    }// termina constructor que pasa parametros
    
    //encapsulamiento get y set

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
    
    
}//termina clase 
