package Ejercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUsuarioDAO implements UsuarioDAO{

	private conexionBase conexion = new conexionBase();
	
	@Override
	public boolean consulta(String usuario, String pass) {
		Connection connect = conexion.conectar();
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement();
			result = stmt.executeQuery("select * from Usuarios");
			while(result.next()) {
				if(result.getString("Nickname").equals(usuario) && result.getString("Password").equals(pass)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
