package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexion.Conexion;

public class JDBCIMCDAO implements IMCDAO{

	private Conexion conexion;
	private Connection connect;
	
	public JDBCIMCDAO() {
		this.conexion = new Conexion();
		this.connect = conexion.conectar("m_ejerProg2","m","1234");
	}

	@Override
	public void insertar(double masa, double altura, double valoracion, String resultado) {
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("INSERT INTO Datos (Masa,Altura,Fecha,Valoracion,Resultado) VALUES (?,?,current_date(),?,?)");
			ps.setDouble(1,masa);
			ps.setDouble(2,altura);
			ps.setDouble(3,valoracion);
			ps.setString(4,resultado);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mostrar() {
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement();
			result = stmt.executeQuery("select * from Datos");
			while(result.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
}