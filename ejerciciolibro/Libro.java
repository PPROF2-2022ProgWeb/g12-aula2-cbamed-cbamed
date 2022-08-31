
package ejerciciolibro;


public class Libro {
    
    //variables
    private int isbn, numeroPagina;
    private String titulo, autor, genero;
    
    //constructor
    public Libro(int pisbn, int pnumeroPagina, String ptitulo, String pautor, String pgenero)
    {
        isbn = pisbn;
        numeroPagina = pnumeroPagina;
        titulo = ptitulo;
        autor = pautor;
        genero = pgenero;  
    }
    
    //metodos Getter y Setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
  
    @Override
    
    public String toString(){
        return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numeroPagina + 
                " pagina " + " numero de paginas con genero " + genero;
    }    
}
