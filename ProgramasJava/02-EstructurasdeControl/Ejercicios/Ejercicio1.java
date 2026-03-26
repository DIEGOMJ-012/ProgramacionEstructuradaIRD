package EjerciciosEntrega;
import javax.swing.JOptionPane;
public class Ejercicio1 {
/**
*Solicita números enteros hasta que el usuario ingrese un número negativo. Muestra la
 * suma total y cuántos números válidos se ingresaron.
 **/
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador = 0;
        while(true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero Entero"));
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
        }JOptionPane.showMessageDialog(null,
                "Datos Ingresados: " + contador +
                  "\nSuma Total: " + suma);
        }
    }