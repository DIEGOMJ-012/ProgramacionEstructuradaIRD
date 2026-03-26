import javax.swing.JOptionPane;
public class ejercicio1 {
    public static void main(String[] args) {
        String menu ="",opcion ="";
        boolean sentinel = true;
        menu = "===== Menu General =====\n" +
                "1/A)Opcion uno \n" +
                "2/B)Opcion dos\n" +
                "3/C)Opcion tres\n" +
                "4/S)Salir\n" +
                "Elegir Opcion: ";
        do {
            opcion = JOptionPane.showInputDialog(null, menu);
            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    JOptionPane.showMessageDialog(null, "Opcion 1");
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null, "Salir");
                    sentinel=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no Valida");
            }
        }while(sentinel);
    }
}