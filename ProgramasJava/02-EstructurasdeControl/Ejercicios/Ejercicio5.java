package EjerciciosEntrega;
import javax.swing.JOptionPane;
/**
*Solicita un número entero positivo y determina si es primo.
 **/
public class Ejercicio5 {
    public static void main(String[] args) {
        int Numero;
        boolean NumPrimo = true;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Entero"));
        if (Numero < 0) {
            NumPrimo = false;
        } else {
            for (int i = 2; i < Numero; i++) {
                if (Numero % i == 0) {
                    NumPrimo = false;
                    break;
                }
            }
            if (NumPrimo) {
                JOptionPane.showMessageDialog(null, Numero + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, Numero + " no es primo");
            }
        }
    }
}