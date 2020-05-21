import java.util.Date;

public class Juego {
    private String nombre;
    private String descripcion;
    private Date fechaAdquisición;
    private Jugador jugador;

    public Juego(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAdquisición = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAdquisición() {
        return fechaAdquisición;
    }

    public void setFechaAdquisición(Date fechaAdquisición) {
        this.fechaAdquisición = fechaAdquisición;
    }



    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaAdquisición=" + fechaAdquisición +
                '}';
    }
}
