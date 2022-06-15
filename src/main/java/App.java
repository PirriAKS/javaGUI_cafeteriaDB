import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author Alejandro Alba
 */
public class App extends JFrame {
    protected static App a;
    protected static Login log;
    protected static DefaultListModel productos_buscar;
    private JPanel container;
    private JPanel izquierda;
    private JPanel derecha;
    private JList list_productos;
    private JTextField text_buscar;
    private JList list_ticket;
    private JTextField text_camarero;
    private JSpinner spinner1;
    private JTextField text_preciototal;
    private JButton button_generar;
    private JButton agregarButton;
    private JButton button_eliminar;
    private JTextField text_num_mesa;
    private JLabel label_mesa;
    private static int[] codigo_productos;
    protected static Mesa mesa;
    protected static Mesas m;

    public App() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bebida b = (Bebida) list_productos.getSelectedValue();
                mesa.valor=mesa.valor+b.getPrecio();
                mesa.lista.addElement(b);
                a.text_preciototal.setText(String.valueOf(mesa.getValor()));
            }
        });
        button_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bebida b = (Bebida) list_ticket.getSelectedValue();
                mesa.valor=mesa.valor-b.getPrecio();
                mesa.lista.remove(list_ticket.getSelectedIndex());
                a.text_preciototal.setText(String.valueOf(mesa.getValor()));
                a.button_eliminar.setEnabled(false);
            }
        });
        button_generar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                crearTicket(generarTicket());
                m.cancelarMesa(mesa.getNumero());
                JOptionPane.showMessageDialog(container,"Ticket creado");
                a.dispose();
                m.cerrarVentana();
            }
        });
        list_productos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                a.agregarButton.setEnabled(true);
            }
        });
        list_ticket.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                a.button_eliminar.setEnabled(true);
            }
        });
    }
    protected static void init(Mesa mesa_select, boolean flag) {
        a = new App();
        mesa=mesa_select;
        a.setContentPane(a.container);
        a.setVisible(true);
        productos_buscar = new DefaultListModel<>();
        loadProducts();
        a.list_productos.setModel(productos_buscar);
        if(flag){
            a.list_ticket.setModel(mesa.getLista());
        }else{
            mesa.lista =new DefaultListModel<>();
            a.list_ticket.setModel(mesa.getLista());
        }
        a.setSize(1600, 800);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.label_mesa.setText("Mesa numero: "+mesa.getNumero());
        a.text_camarero.setText(log.u.getNombre());
        a.text_num_mesa.setText(String.valueOf(mesa.getNumero()));
        a.text_preciototal.setText(String.valueOf(mesa.getValor()));
        a.agregarButton.setEnabled(false);
        a.button_eliminar.setEnabled(false);
    }
    protected static void loadProducts() {
        try {
            Statement st = log.con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM productos");
            while (rs.next()) {
                Bebida b = new Bebida(rs.getByte(1), rs.getString(2), rs.getFloat(3));
                a.productos_buscar.addElement(b);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    protected static Factura generarTicket() {
        codigo_productos = new int[mesa.lista.size()];
        for (int i = 0; i < mesa.lista.size(); i++) {
            Bebida p_ticket = (Bebida) mesa.lista.get(i);
            codigo_productos[i] = p_ticket.getCodigo();
        }
        Factura ticket = new Factura(log.u.getCodigo(), Arrays.toString(codigo_productos), a.text_num_mesa.getText(), LocalDateTime.now(), a.text_preciototal.getText());
        return ticket;
    }
    protected static void crearTicket(Factura ticket) {
        try {
            PreparedStatement ps = log.con.prepareStatement("INSERT INTO factura VALUES (?,?,?,?,?,?)");
            ps.setString(1, null);
            ps.setString(2, ticket.getCodigo_camarero());
            ps.setString(3, ticket.getCodigo_producto());
            ps.setString(4, ticket.getNum_mesa());
            ps.setString(5, String.valueOf(ticket.getFecha()));
            ps.setString(6, ticket.getValor());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
