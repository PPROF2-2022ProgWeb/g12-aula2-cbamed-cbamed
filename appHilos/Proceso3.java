
package app;


public class Proceso3 extends Thread{
@Override
    
    public void run (){
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 3");
        }
    }
}