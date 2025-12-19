public class ReglasNombresVariables {
    public static void main(String[] args) {
        // reglas nombres variables
        String nombreCompleto = "Juan Carlos";
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carolos 2";
        System.out.println("NombreCompleto = " + NombreCompleto);
        String nombre_completo = "Juan C"; // no aplica buenas practicas ya que lo hace cuando es camelcase
        System.out.println("nombre_completo = " + nombre_completo);
        String _apellido = "Perez"; // tambien buenas practicas comenzar con _ o con $
        System.out.println("_apellido = " + _apellido);
        int totpzs = 10; // correcta pero no buenas practicas, ideal usar nombre completo
        System.out.println("totpzs = " + totpzs);


    }
}
