public class RetoReservaHotel {
    public static void main(String[] args) {
        var nombreCliente = "Juan";
        var apellidoCliente = "Perez";
        var nombreClienteCompleto = nombreCliente + " " + apellidoCliente;
        System.out.println("nombreClienteCompleto = " + nombreClienteCompleto);
        var diasEstancia = 5;
        System.out.println("diasEstancia = " + diasEstancia);
        var tarifaDiaria = 100.00;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        var vistaMar = true;
        System.out.println("vistaMar = " + vistaMar);
        diasEstancia = 7;
        System.out.println("diasEstancia = " + diasEstancia);
        vistaMar = false;
        System.out.println("vistaMar = " + vistaMar);
    }
}
