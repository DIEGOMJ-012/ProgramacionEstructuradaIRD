import javax.swing.JOptionPane;
public class VerificacionAprobado {
    public static void main(String[] args) {
        //Declararcion
        double promedio = 0.0, cal1 = 0.0, cal2 = 0.0, cal3 = 0.0;
        //Solicitar y Calcular
        cal1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1"));
        cal2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2"));
        cal3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3"));
        promedio = (cal1+cal2+cal3)/3;
        if (promedio >= 7.0) {
            JOptionPane.showMessageDialog(null,"Aprobado");
        }
    }
}