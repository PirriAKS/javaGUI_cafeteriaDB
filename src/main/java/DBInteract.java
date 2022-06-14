import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Alejandro Alba
 */
public class DBInteract {
    public static void cargaDriver(String drv)throws ClassNotFoundException{
        Class.forName(drv);
    }
    //2. Conectarnos
    public static Connection connect(String db,String user,String pass) throws SQLException{
        Connection con= DriverManager.getConnection(db,user,pass);
        return con;
    }
    //3. Desconectarnos
    public static void disconect(Connection con) throws SQLException{
        con.close();
    }
}

