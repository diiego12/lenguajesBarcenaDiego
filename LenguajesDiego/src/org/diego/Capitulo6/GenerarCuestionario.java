package org.diego.Capitulo6;

import java.util.*;

public class GenerarCuestionario {
    
    public static ArrayList<Pregunta> obtenerCuestionario(){
    
       ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
       ArrayList <Opcion> opciones1 = new ArrayList<Opcion>(); 
        Opcion op11 = new Opcion("EL Salvador",false,1);
        Opcion op12 = new Opcion("Perú",false,2);
        Opcion op13 = new Opcion("México",false,3);
        Opcion op14 = new Opcion("Filandia",true,4);
               
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
         
        ArrayList <Opcion> opciones2 = new ArrayList<Opcion>();
        Opcion op21 = new Opcion("Rusia",false,1);
        Opcion op22 = new Opcion("La India",false,2);
        Opcion op23 = new Opcion("Australia",true,3);
        Opcion op24 = new Opcion("México",false,4);
        
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        
        ArrayList <Opcion> opciones3 = new ArrayList<Opcion>();
        Opcion op31 = new Opcion("México",false,1);
        Opcion op32 = new Opcion("Países Bajos",true,2);
        Opcion op33 = new Opcion("Mozambique",false,3);
        Opcion op34 = new Opcion("Nigeria",false,4);
        
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        
        
        Pregunta p1 = new Pregunta (1,"¿Cual es el país con mejor sistema de educación?",opciones1);
             
         cuestionario.add(p1);  
         
         Pregunta p2 = new Pregunta(2,"¿Qué país tiene más calidad de vida?",opciones2);
                            
         cuestionario.add(p2);
         
         Pregunta p3 = new Pregunta (3,"¿Qué país cuenta con la mejor alimentación?",opciones3);
         
         cuestionario.add(p3);
         
         return cuestionario;

        }
    }
