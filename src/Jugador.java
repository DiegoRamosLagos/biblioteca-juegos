import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String email;
    private String nombreUsuario;
    private List<Juego> juegos = new ArrayList<>();

    public Jugador(String email, String nombreUsuario) {
        this.email = email;
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    public void agregarJuego(Juego juego) {
        juegos.add(juego);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "email='" + email + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", juegos=" + juegos +
                '}';
    }
}
