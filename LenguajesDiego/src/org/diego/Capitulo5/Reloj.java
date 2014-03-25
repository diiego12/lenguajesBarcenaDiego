
package org.diego.Capitulo5;


public class Reloj implements Runnable{

    public static void main(String[] args) {
        Runnable r = new Reloj();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        
        t1.start();
        t2.start();
    }
    public void run(){
        
    }
    
}
