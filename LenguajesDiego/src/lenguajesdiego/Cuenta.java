package lenguajesdiego;

/**
 *
 * @author DiiegOO
 */
public class Cuenta {

    private float saldo;
    private String nombre;
    private int edad;

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        ValidacionCuenta.validarCuenta(saldo);
        this.saldo = saldo;
    }



}


