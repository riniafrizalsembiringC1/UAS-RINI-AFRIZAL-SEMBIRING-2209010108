package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
    Connection rini;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection rini = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa","root","");
            return rini;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
