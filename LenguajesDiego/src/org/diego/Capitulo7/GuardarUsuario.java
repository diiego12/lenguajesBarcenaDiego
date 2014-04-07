
package org.diego.capitulo7;


import java.io.File;


import java.io.*;
public class GuardarUsuario {
    
    public synchronized static Usuario leer()throws Exception{
   File file=new File("algo.txt");    
   
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  Usuario u=(Usuario)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Usuario u)throws Exception{
       File file=new File("algo.txt");    
   
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
  ois.writeObject(u); 
 ois.close();
  System.out.println("Guardado");
    }
    
}

 
 


 
   

Status
 API
 Training
 Shop
 Blog
 About
 