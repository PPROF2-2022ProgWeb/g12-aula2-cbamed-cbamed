package ejerciciolibro;

public class EjercicioLibro {

    public static void main(String[] args) {
       
        //instanciamos el objeto 
        
        Libro libro1 = new Libro(198988881, 191, "La piedra filosofal", "Maria Perez", "Aventura");
        Libro libro2 = new Libro(36522444, 300, "Viaje al fin del mundo", "Mercedes Himun", "Fantasia");
        
        //Mostrar los datos
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        //Modificamos la cantidad de paginas de los libros
        libro1.setNumeroPagina(900);
        
        //Mostramos cual de los dos tiene mas paginas
        
        if(libro1.getNumeroPagina() > libro2.getNumeroPagina()){
            System.out.println(libro1.getTitulo() + " Tiene mas paginas");
        } 
        else {
            System.out.println(libro2.getTitulo() + " Tiene mas paginas");
        }
    }
    
}

