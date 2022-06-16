import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Alejandro Alba
 */
public class Login extends JFrame {
    private JPanel container;
    private JPanel container_login;
    private JTextField text_user;
    private JButton button_login;
    private JPasswordField passwordField_password;
    protected static Login log;
    private static App a;
    protected static Usuario u;
    protected static final String DRIVER="com.mysql.jdbc.Driver";
    protected static final String DB="jdbc:mysql://localhost/cafeteria";
    protected static final String USER="root";
    protected static final String PASS="";
    protected static Connection con;
    protected static Mesas m;
    protected static ArrayList lista_mesas;
    protected static Mesa mesa1;
    protected static Mesa mesa2;
    protected static Mesa mesa3;
    protected static Mesa mesa4;
    protected static Mesa mesa5;
    protected static Mesa mesa6;
    protected static Mesa mesa7;
    protected static Mesa mesa8;
    protected static Mesa mesa9;
    protected static Mesa mesa10;

    public Login() {
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass= String.valueOf(log.passwordField_password.getPassword());
                String nombre=log.text_user.getText();
                try {
                    if(searchLogin(nombre,pass)){m.init();}
                    else{JOptionPane.showMessageDialog(log.container,"error en el login");}
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public static void main(String[] args) {
        try {
            init();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void init() throws ClassNotFoundException, SQLException {
        log=new Login();
        cargarMesas();
        DBInteract dbi=new DBInteract();
        dbi.cargaDriver(DRIVER);
        con=dbi.connect(DB,USER,PASS);
        log.setContentPane(log.container);
        log.setVisible(true);
        log.setSize(300,300);
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    protected static boolean searchLogin(String nombre, String pass) throws SQLException {
            Statement st =con.createStatement();
            ResultSet rs;
            rs=st.executeQuery("SELECT * FROM camareros WHERE nombre='"+nombre+"' AND password='"+pass+"'");
            if(rs.next()) {
                u = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
                return true;
            }else{
                return false;
            }
    }
    protected static void cargarMesas() {
        lista_mesas = new ArrayList<Mesa>();
        mesa1=new Mesa();
        mesa2=new Mesa();
        mesa3=new Mesa();
        mesa4=new Mesa();
        mesa5=new Mesa();
        mesa6=new Mesa();
        mesa7=new Mesa();
        mesa8=new Mesa();
        mesa9=new Mesa();
        mesa10=new Mesa();
        lista_mesas.add(mesa1);
        lista_mesas.add(mesa2);
        lista_mesas.add(mesa3);
        lista_mesas.add(mesa4);
        lista_mesas.add(mesa5);
        lista_mesas.add(mesa6);
        lista_mesas.add(mesa7);
        lista_mesas.add(mesa8);
        lista_mesas.add(mesa9);
        lista_mesas.add(mesa10);
    }
}