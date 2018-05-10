package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	private static Conexion bd;
	private Connection conectar;
	
	private Conexion(String base, String usu, String pass) {
		Conexion.bd = new Conexion(base, usu, pass);
		this.conectar = bd.conectar(base, usu, pass);
	}
	
	public Connection conectar(String base, String usu, String pass) {
		Connection conexion = null;
		boolean valid = false;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/"+ base +"?useSSL=false&useLegacyDateTimeCode=false&serverTimezone=UTC",usu,pass);
			valid=conexion.isValid(5000);
			System.out.println(valid ? "OK" : "FAIL");
			
		} catch (java.sql.SQLException sql) {
			System.out.println("Error" + sql);
		}
		return conexion;
	}

	public static Conexion getInstance() {
		return bd;
	}

	public Connection getConectar() {
		return conectar;
	}

	public void setConectar(Connection conectar) {
		this.conectar = conectar;
	}
}
