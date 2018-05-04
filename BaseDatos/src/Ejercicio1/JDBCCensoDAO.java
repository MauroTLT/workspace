package Ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCensoDAO implements CensoDAO {

	private conexionBase conexion = new conexionBase();
	
	@Override
	public void insertPersona(Persona persona) {
		Connection connect = conexion.conectar();
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("INSERT INTO Censo VALUES (?,?,?,?,?)");
			ps.setString(1,persona.getDni());
			ps.setString(2,persona.getNombre());
			ps.setString(3,persona.getFecha());
			ps.setString(4,persona.getDireccion());
			ps.setInt(5,persona.getTelefono());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removePersona(String dni) {
		Connection connect = conexion.conectar();
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("delete from Censo where DNI = ?");
			ps.setString(1, dni);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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

	@Override
	public void modify(String dni, String nombre, String cambio) {
		Connection connect = conexion.conectar();
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("UPDATE Censo SET " + nombre + " = ? WHERE DNI = ?");
			ps.setString(1, cambio);
			ps.setString(2, dni);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
