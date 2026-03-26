package EjerciciosEntrega;
import javax.swing.JOptionPane;
/**
 * Solicita el número de alumnos de un grupo y registra si cada uno está Presente (P) o
 * Ausente (A). Muestra el porcentaje de asistencia.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String menu = "", opcion = "";
        int alumnosTotales, alumnosProcesados = 0, presentes = 0;
        alumnosTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Numero Total de Alumnos"));
        if (alumnosTotales <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad de alumnos debe ser mayor a 0");
        } else {
            while (alumnosProcesados < alumnosTotales) {
                menu = "===== Registro de Asistencia =====\n" +
                        "Alumno #" + (alumnosProcesados + 1) + " de " + alumnosTotales + "\n" +
                        "P) Presente\n" +
                        "A) Ausente\n" +
                        "Elegir Opcion: ";
                opcion = JOptionPane.showInputDialog(null, menu);
                switch (opcion.toUpperCase()) {
                    case "P":
                        presentes++;
                        alumnosProcesados++;
                        break;
                    case "A":
                        alumnosProcesados++;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
            if (alumnosProcesados == alumnosTotales) {
                double porcentajeAsistencia = ((double) presentes / alumnosTotales) * 100;
                String resultado = "===== Resumen de Asistencia =====\n" +
                        "Total de Alumnos: " + alumnosTotales + "\n" +
                        "Presentes: " + presentes + "\n" +
                        "Ausentes: " + (alumnosTotales - presentes) + "\n" +
                        "Porcentaje de Asistencia: " + porcentajeAsistencia + "%";
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }
}