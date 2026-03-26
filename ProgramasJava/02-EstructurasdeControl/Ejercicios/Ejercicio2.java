package EjerciciosEntrega;
import javax.swing.JOptionPane;
/**
*Muestra un menú con opciones para sumar, restar y multiplicar dos números. El menú
*se repite hasta que el usuario decida salir.
 **/
public class Ejercicio2 {
    public static void main(String[] args) {
        String menu ="",opcion ="";
        double Num1, Num2, Resultado;
        boolean sentinel = true;
        menu = "===== Menu General =====\n" +
                "1)Suma \n" +
                "2)Resta\n" +
                "3)Multiplicacion\n" +
                "4)Salir \n" +
                "Elegir Opcion: ";
        do {
            opcion = JOptionPane.showInputDialog(null, menu);
            switch (opcion.toUpperCase()) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Suma");
                    Num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer Numero"));
                    Num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Siguiente Numero"));
                    Resultado = Num1 + Num2;
                    JOptionPane.showMessageDialog(null,"El Resultado es: "+ Resultado);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Resta");
                    Num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer Numero"));
                    Num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Siguiente Numero"));
                    Resultado = Num1 - Num2;
                    JOptionPane.showMessageDialog(null,"El Resultado es: "+ Resultado);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Multiplicacion");
                    Num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer Numero"));
                    Num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Siguiente Numero"));
                    Resultado = Num1 * Num2;
                    JOptionPane.showMessageDialog(null,"El Resultado es: "+ Resultado);
                case "4":
                    JOptionPane.showMessageDialog(null, "Salir");
                    sentinel=false;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opcion no Valida");
            }
        }while(sentinel);
    }
}