/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadprueba;

/**
 *
 * @author brend
 */
public class proceso2 extends Thread {

    public proceso2(String msg) {

        super(msg);

    }

    @Override
    public void run() {
        for (int i = 0; i <= 5000; i++) {

            System.out.println("Proceso 2");

        }
    }
}
