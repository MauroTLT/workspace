import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionBase {
	
	public Connection conectar() {
		Connection conexion = null;
		boolean valid = false;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/m_prueba?useSSL=false&useLegacyDateTimeCode=false&serverTimezone=UTC","m","1234");
			valid=conexion.isValid(5000);
			System.out.println(valid ? "OK" : "FAIL");
			
		} catch (java.sql.SQLException sql) {
			System.out.println("Error" + sql);
		}
		return conexion;
	}
	
	public static void main(String[] args) {
		conexionBase conexion = new conexionBase();
		Connection connect = conexion.conectar();
		
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement();
		
			result = stmt.executeQuery("select * from film");
			
			while(result.next()) {
				int exp = result.getInt("length");
				System.out.println(exp);
			}
			
			stmt.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
