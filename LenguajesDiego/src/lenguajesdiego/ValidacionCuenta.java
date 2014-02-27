package lenguajesdiego;

/**
 *
 * @author DiiegOO
 */
public class ValidacionCuenta {
    public static void validarCuenta(float saldo) throws CuentaSinFondoExc{
        if(saldo <0) throw new CuentaSinFondoExc();
        
    }
}
