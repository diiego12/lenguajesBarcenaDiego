package lenguajesdiego;

/**
 *
 * @author DiiegOO
 */
public class Cuenta {

    private float saldo;
    private String nombre;
    private int edad;

    public Cuenta(float saldo, String nombre) {
        this.saldo = saldo;
        this.nombre = nombre;
    }
    

    public Cuenta(String nombre, float saldo){
        this.nombre=nombre;
        this.saldo=saldo;
    }
    

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

    public void setSaldo(float saldo) throws CuentaSinFondoExc {
        ValidacionCuenta.validarCuenta(saldo);
        this.saldo = saldo;
    }

    public String toString(){
        return "usuario " +nombre+ " creado con saldo " +saldo; 
    }


}


