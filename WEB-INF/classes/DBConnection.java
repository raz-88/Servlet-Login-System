import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {

                // Load MySQL Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create Connection
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/users_db?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    ""
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}