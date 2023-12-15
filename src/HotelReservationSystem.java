import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelReservationSystem {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/hotel_db";
    private static final String usernam =  "root";
    private static final String password = "1234";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //registerd with drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, usernam, password);
    }

}
