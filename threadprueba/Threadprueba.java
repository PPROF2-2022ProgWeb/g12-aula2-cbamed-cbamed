/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.threadprueba;

/**
 *
 * @author brend
 */
public class Threadprueba {

    public static void main(String[] args) {
        Thread hilo = new proceso1("proceso 1");
        Thread hilo2 = new proceso2("proceso 2");
        Thread hilo3 = new Thread(new proceso3());

        hilo.start();

        hilo2.start();

        hilo3.start();

    }
}
