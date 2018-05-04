package Ejercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUsuarioDAO implements UsuarioDAO{

	private conexionBase conexion = new conexionBase();
	
	@Override
	public Persona consulta(String dni) {
		Connection connect = conexion.conectar();
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement();
			result = stmt.executeQuery("select * from Censo");

			while(result.next()) {
				/*for (int i = 0; i < CensoModel.getPersonas().size(); i++) {
					if(CensoModel.getPersonas().get(i).getDni().equalsIgnoreCase(dni)) {
						return CensoModel.getPersonas().get(i);
					}
				}*/
				if(result.getString("DNI").equals(dni)) {
					return new Persona(result.getString("DNI"), result.getString("Nombre"), result.getString("Fecha Nacimiento"), result.getString("Direccion"), result.getInt("Telefono"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
