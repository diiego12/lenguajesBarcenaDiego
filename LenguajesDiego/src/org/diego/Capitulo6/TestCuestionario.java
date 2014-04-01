package org.diego.Capitulo6;

public class TestCuestionario {

    public static void main(String[] args) {
        GenerarCuestionario c1 = new GenerarCuestionario();
        for(Pregunta p: c1.){
            System.out.println(p.getTitulo());
        for(Opcion o: c1.){
            System.out.println(o.getTitulo());
        }
        }
        
    }
}
