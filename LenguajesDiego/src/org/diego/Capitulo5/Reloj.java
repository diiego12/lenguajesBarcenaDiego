
package org.diego.Capitulo5;

import java.util.*;

public class Reloj {

    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                while(true){
                try {
                    Thread.sleep(1000);
                    //Crear un objeto que se llama Calendar
                Calendar cal = Calendar.getInstance();
                int hora=cal.get(Calendar.HOUR);
                int minuto=cal.get(Calendar.MINUTE);
                int segundo=cal.get(Calendar.SECOND);
                String time=hora+":"+minuto+":"+segundo;
                    System.out.println(time);
                } catch (InterruptedException ex) {
                   
                }
            }}
        });
        
        t1.start();
    }
    
    
}
