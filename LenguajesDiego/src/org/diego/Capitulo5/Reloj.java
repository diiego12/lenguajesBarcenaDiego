
package org.diego.Capitulo5;


public class Reloj {

    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("este es el primer thread");
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                System.out.println("estoy seguro que este es el thread 2");
            }
        });
        
        t1.start();
        t2.start();
    }
    
    
}
