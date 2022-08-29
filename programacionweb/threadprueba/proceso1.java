/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadprueba;

/**
 *
 * @author brend
 */
public class proceso1 extends Thread {

    public proceso1(String msg) {
//se heredan propiedas de la clase thread
        super(msg);
    }

//este metodo es el que se va a reproducir o lo quequeremios ejecutar
    @Override
    public void run() {
        for (int i = 0; i <= 5000; i++) {
//getName() es la variable para que aparezca el nombre del proceso
            System.out.println("Proceso 1");
        }

    }
}
