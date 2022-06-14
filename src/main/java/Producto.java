/**
 * @author Alejandro Alba
 */
public class Producto {
    int codigo;
    String nombre;
    float precio;

    public Producto() {
    }

    public Producto(int codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre+" / "+precio+"€";
    }
    public String toString_ticket() {
        return codigo+"/";
    }
}
