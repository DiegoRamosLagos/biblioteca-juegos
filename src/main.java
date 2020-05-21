public class main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        controlador.nuevoJugador("pablo@gmail.com", "pueblo");
        controlador.iniciarSesion("pueblo");
        System.out.println(controlador.datosSesionActual());
        controlador.agregarJuego("Mario peleas", "super smash bros");
        System.out.println(controlador.datosSesionActual());
        controlador.jugar();

    }
}
