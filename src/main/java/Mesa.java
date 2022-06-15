import javax.swing.*;

/**
 * @author Alejandro Alba
 */
public class Mesa {
    int numero;
    float valor;
    boolean creada=false;
    String camarero;
    DefaultListModel lista;
    public Mesa() {
    }

    public Mesa(int numero, float valor, boolean creada, String camarero, DefaultListModel lista) {
        this.numero = numero;
        this.valor = valor;
        this.creada = creada;
        this.camarero=camarero;
        this.lista=lista;
    }

    public String getCamarero() {
        return camarero;
    }

    public void setCamarero(String camarero) {
        this.camarero = camarero;
    }

    public DefaultListModel getLista() {
        return lista;
    }

    public void setLista(DefaultListModel lista) {
        this.lista = lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isCreada() {
        return creada;
    }

    public void setCreada(boolean creada) {
        this.creada = creada;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", valor=" + valor +
                ", creada=" + creada +
                ", camarero='" + camarero + '\'' +
                ", lista=" + lista +
                '}';
    }
}
