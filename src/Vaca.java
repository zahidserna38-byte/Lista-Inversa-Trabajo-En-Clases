import java.util.Objects;

public class Vaca {
    private final String nombre;

    public Vaca(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vaca: " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vaca vaca = (Vaca) o;
        return Objects.equals(nombre, vaca.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}