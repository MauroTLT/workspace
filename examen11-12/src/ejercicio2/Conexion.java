package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public class Conexion {
	
	private static Conexion conexion;
	private Connection conection;
	
	private Conexion(String base, String user, String pass) {
		this.conection = conectar(base, user, pass);
	}

	private Connection conectar(String base, String user, String pass) {
		Connection connct = null;
		try {
			connct = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + base + "?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return connct;
	}
	
	public static Conexion getInstance() {
		if (conexion == null) {
			conexion = new Conexion("m_examenProg", "m", "1234");
		}
		return conexion;
	} 

	public Connection getConection() {
		return conection;
	}

	public void setConection(Connection conection) {
		this.conection = conection;
	}
	
}
