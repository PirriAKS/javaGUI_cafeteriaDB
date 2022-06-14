import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    protected static boolean reserva1=false;
    protected static boolean reserva2=false;
    protected static boolean reserva3=false;
    protected static boolean reserva4=false;
    protected static boolean reserva5=false;
    protected static boolean reserva6=false;
    protected static boolean reserva7=false;
    protected static boolean reserva8=false;
    protected static boolean reserva9=false;
    protected static boolean reserva10=false;

    public Login() {
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass= String.valueOf(log.passwordField_password.getPassword());
                String nombre=log.text_user.getText();
                boolean flag=searchLogin(nombre,pass);
                if(flag){m.init();}
                if(!flag){JOptionPane.showMessageDialog(log.container,"error en el login");}
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
        DBInteract dbi=new DBInteract();
        dbi.cargaDriver(DRIVER);
        con=dbi.connect(DB,USER,PASS);
        log.setContentPane(log.container);
        log.setVisible(true);
        log.setSize(300,300);
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    protected static boolean searchLogin(String nombre, String pass){
        try {
            Statement st =con.createStatement();
            ResultSet rs;
            rs=st.executeQuery("SELECT * FROM camareros WHERE nombre='"+nombre+"' AND password='"+pass+"'");
            if(rs.next()) {
                 do{
                    u = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
                }while (rs.next());
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
