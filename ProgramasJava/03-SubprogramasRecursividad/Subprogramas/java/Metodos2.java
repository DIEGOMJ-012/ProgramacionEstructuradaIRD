public class Metodos2 {
    public static void saludar(){
        JOptionPane.showMessageDialog(null,"Saludar");
    }
    public static void saludar (String nombre){
        JOptionPane.showMessageDialog(null,"Hola" + nombre);
    }
    public static int sumar (int a, int b){
        return  a + b;
    }
    public static double sumar (double a, int b){
        return  a + b;
    }
}