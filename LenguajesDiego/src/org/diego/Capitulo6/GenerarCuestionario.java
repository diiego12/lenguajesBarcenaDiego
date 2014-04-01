package org.diego.Capitulo6;

import java.util.*;

public class GenerarCuestionario {
    
    public ArrayList<Pregunta> obtenerCuestionario(){
    
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
         
        Pregunta p1 = new Pregunta (1,"¿Cual es el país con mejor sistema de edicación?",opciones1);
        
        
         cuestionario.add(p1);      
                        
    return cuestionario;

        }
    }
