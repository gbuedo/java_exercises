public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de Var en Java ***");
        // sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // definir otras variables usando
        var edad = 30;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // se infiere el tipo float
        var esCasado = false;
    }
}
