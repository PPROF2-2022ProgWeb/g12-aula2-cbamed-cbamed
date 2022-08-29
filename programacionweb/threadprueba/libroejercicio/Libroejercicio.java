/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libroejercicio;

/**
 *
 * @author brend
 */
public class Libroejercicio {

    public static void main(String[] args) {
         //Inicialización objeto
        
        libro libro1 = new libro(978815555, "Crimen Y Castigo  ", "Fiodor Dostoyevski ", 836, "Psicologico");
        libro libro2 = new libro(456545677, "Un mundo feliz", "Huxley Aldous ", 208, "Ciencia Ficcion");
        
        // se muestra
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

       // Getter y Setter
     
        
        if (libro1.getnumPaginas() > libro2.getnumPaginas()) {
            System.out.println(libro1.getTitulo() + "tiene mas paginas");
        } else {
            System.out.println(libro2.getTitulo() + "tiene mas paginas");
        }
                
    }
}
