import java.sql.*;

public class TestDb {
    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12613114", "sql12613114", "eCZsBjGQ8s");
            System.out.println("Database is connected !");
            Connection connection;
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM HealthParameters WHERE Patient_id = 3");

            while (resultSet.next()) {
                int column1 = resultSet.getInt("ID");
                Date column2 = resultSet.getDate("Date");
                int column3 = resultSet.getInt("HR");
                int column4 = resultSet.getInt("SpO2");
                int column5 = resultSet.getInt("Temp");
                System.out.println("ID: " + column1 + ", Date: " + column2 + ", HR: " + column3 + ", SpO2: "+ column4+ "Temp: "+column5);
            }
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
