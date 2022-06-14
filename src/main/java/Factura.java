import java.time.LocalDateTime;

/**
 * @author Alejandro Alba
 */
public class Factura {
    int codigo;
    String codigo_camarero;
    String codigo_producto;
    String num_mesa;
    LocalDateTime fecha;
    String valor;

    public Factura() {
    }

    public Factura(String codigo_camarero, String codigo_producto, String num_mesa, LocalDateTime fecha, String valor) {
        this.codigo_camarero = codigo_camarero;
        this.codigo_producto = codigo_producto;
        this.num_mesa = num_mesa;
        this.fecha = fecha;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigo_camarero() {
        return codigo_camarero;
    }

    public void setCodigo_camarero(String codigo_camarero) {
        this.codigo_camarero = codigo_camarero;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(String num_mesa) {
        this.num_mesa = num_mesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "codigo=" + codigo +
                ", codigo_camarero=" + codigo_camarero +
                ", codigo_producto=" + codigo_producto +
                ", num_mesa=" + num_mesa +
                ", fecha='" + fecha + '\'' +
                ", valor=" + valor +
                '}';
    }
}
