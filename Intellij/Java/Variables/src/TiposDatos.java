public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros
        Byte tipobyte = 127; // maximo valor 127 - 128 da error
        System.out.println("tipobyte = " + tipobyte);
        short tiposhort = 32000;
        System.out.println("tiposhort = " + tiposhort);
        int tipoint = 2147483647;
        System.out.println("tipoint = " + tipoint);
        long tipolong = 987654321;
        System.out.println("tipolong = " + tipolong);
        // tipos de datos punto flotante
        float tipofloat = 3.14F;
        System.out.println("tipofloat = " + tipofloat);
        double tipodouble = 3.1315D;
        System.out.println("tipodouble = " + tipodouble);
        // Caracter
        char tipochar = 'A'; // Caracteres del juego de unicode
        System.out.println("tipochar = " + tipochar);
        tipochar = 65;
        System.out.println("tipochar = " + tipochar);
        // Booleano
        boolean tipoboolean = true;
        System.out.println("tipoboolean = " + tipoboolean);
        tipoboolean = false;
        System.out.println("tipoboolean = " + tipoboolean);

        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
