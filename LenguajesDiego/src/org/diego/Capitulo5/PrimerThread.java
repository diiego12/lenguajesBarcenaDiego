package org.diego.Capitulo5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class PrimerThread implements Runnable{
    
    public static void main(String[] args) {
        //1.-Creado
        Runnable m = new PrimerThread();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        //2.--Inicializado
        t1.setName("primero");
        t2.setName("sgundo");
        
        t1.start();//inicializador del thread
        t2.start();
    }

    //3.-En ejecución
    public void run() {
        try {
            if(Thread.currentThread().getName().equals("primero"))Thread.sleep(4000);
            System.out.println("soy el thread " + Thread.currentThread().getName());
        } catch (InterruptedException ex) {
           
        }
        
    }

    //5.-Termina su ejecución
}
