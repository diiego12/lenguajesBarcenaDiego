package org.diego.Capitulo5;


public class PrimerThread implements Runnable{
    
    public static void main(String[] args) {
        //1.-Creado
        Runnable m = new PrimerThread();
        Thread t1 = new Thread(m);
        //2.--Inicializado
        t1.start();
        
    }

    //3.-En ejecución
    public void run() {
        System.out.println("soy un thread en ejecución");
    }

    //5.-Termina su ejecución
}
