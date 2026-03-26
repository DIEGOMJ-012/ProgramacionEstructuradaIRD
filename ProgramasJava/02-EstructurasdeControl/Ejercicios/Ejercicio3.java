package EjerciciosEntrega;
import javax.swing.JOptionPane;
/**
*Muestra un menú para convertir temperaturas de Celsius a Fahrenheit y de Fahrenheit a
*Celsius.
**/
public class Ejercicio3 {
    public static void main(String[] args) {
        String menu ="",opcion ="";
        boolean sentinel = true;
        double Celsius, Fahrenheit, Resultado;
        do {
            menu = "===== Menu General =====\n" +
                    "1) Celsius a Fahrenheit \n" +
                    "2) Fahrenheit a Celsius\n" +
                    "3)Salir\n" +
                    "Elegir Opcion: ";
            opcion = JOptionPane.showInputDialog(null, menu);
            switch (opcion.toUpperCase()) {
                case "1":
                    JOptionPane.showMessageDialog(null, "De Celsius a Fahrenheit");
                    Celsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce los Grados Celsius que Desea Convertir"));
                    Resultado = (Celsius * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,"El Resultado en Grados Fahrenheit es: " + Resultado + "°F");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "De Fahrenheit a Celsius");
                    Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Introduce los Grados Fahrenheit que Desea Convertir"));
                    Resultado = (Fahrenheit -32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,"El Resultado en Grados Celsius es: " + Resultado + "°C");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Salir ");
                    sentinel=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no Valida");
            }
        }while(sentinel);
    }
}