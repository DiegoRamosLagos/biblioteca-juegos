import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    Jugador sesion = null;
    public void iniciarSesion(String nombreUsuario) {
        for (Jugador jugador: jugadores) {
            if(jugador.getNombreUsuario() == nombreUsuario){
                sesion = jugador;
                break;
            }
        }
        if (sesion == null)
            System.out.println("El jugador no existe");
        else
            System.out.println("Bienvenido " + sesion.getNombreUsuario());
    }

    public void cerrarSesion() {
        sesion = null;
    }

    private List<Jugador> jugadores = new ArrayList<>();

    public void nuevoJugador(String email, String nombreUsuario) {
        jugadores.add(new Jugador(email, nombreUsuario));
    }

    public void agregarJuego(String nombre, String descripcion) {
        Juego juego = new Juego(nombre, descripcion);
        sesion.agregarJuego(juego);
    }

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Juegos del usuario");
        for (int i = 0; i < sesion.getJuegos().size(); i++) {
            System.out.println(i + ") " + sesion.getJuegos().get(i).getNombre());
        }
        System.out.print("Ingresa el índice del juego: ");int indice = sc.nextInt();
        if (indice <= sesion.getJuegos().size())
            System.out.println("Jugando a: " + sesion.getJuegos().get(indice).getNombre());
    }

    public String datosSesionActual(){
       return sesion.toString();
    }
}
