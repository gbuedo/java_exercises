public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String TituloLibro = "El señor de los Anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        // imprimir el valor de las variables
        System.out.println(TituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);
        // modificar el valor del titulo
        TituloLibro = "El Señor de los Anillos 2";
        System.out.println(TituloLibro);
    }
}
