public class Metodos {
    public static void main(String[] args) {
        //Declaracion de Variables
        int Num1 = 0, Num2 = 0, Suma = 0;
        saludar();
        Num1 = SolicitarNumeros();
        Num2 = SolicitarNumeros();
        Suma = Sumar(Num1, Num2);
    }
    public static void saludar(){
        JOptionPane.showMessageDialog(null,
                "Bienvenido a las Funciones en Java");
    }
    public static int SolicitarNumeros(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el Numero"));
    }
    public static int Sumar (int a, int b){
        return a + b;
    }
}
