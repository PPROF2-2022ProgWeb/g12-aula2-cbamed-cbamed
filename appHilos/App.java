
package app;


public class App {
    public static void main(String[] args) {
        
       Proceso1 hilo1 = new Proceso1();
       Thread hilo2 = new Thread(new Proceso2());
       Thread hilo3 = new Thread(new Proceso3());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
