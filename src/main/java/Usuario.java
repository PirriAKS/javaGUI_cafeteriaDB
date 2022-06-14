/**
 * @author Alejandro Alba
 */
public class Usuario {
    String codigo;
    String nombre;
    String password;

    public Usuario() {
    }

    public Usuario(String codigo, String nombre, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
