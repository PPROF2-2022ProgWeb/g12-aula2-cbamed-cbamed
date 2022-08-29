/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroejercicio;

/**
 *
 * @author brend
 */
public class libro { // Variables o atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    private String genero;
    
    // Constructor

    public libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas, String pGenero)
        {
            ISBN = pISBN;
            titulo = pTitulo;
            autor = pAutor;
            numPaginas = pNumPaginas;
            genero = pGenero;   
        }
    
    // Metodos
    
    public int getISBN() {
        return ISBN;
    }
    
    public void setISBN(int ISBN)  {
        this.ISBN = ISBN;
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
        this.titulo = autor;
    }
    
     public int getnumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas)  {
        this.numPaginas = numPaginas;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "El libro " + titulo+ " con ISBN " + ISBN + " escrito por " + autor + "tiene " + numPaginas + " paginas, y es de " + genero;
    }
    
    
    
    
    
}
