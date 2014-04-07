package org.diego.capitulo7;

public class TestUsuario {
    public static void main(String[] args) throws Exception {
      Usuario u=new Usuario("juan carlos", 45, "rapidclimate@gmail.com");
      GuardarUsuario.guardar(u);
    }
    

}
