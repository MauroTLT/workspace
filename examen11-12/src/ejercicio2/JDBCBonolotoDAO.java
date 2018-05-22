package ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public class JDBCBonolotoDAO implements BonolotoDAO {

	private Conexion conexion;
	
	public JDBCBonolotoDAO() {
		conexion = Conexion.getInstance();
	}
	
	@Override
	public int insertarApuesta(BonolotoModel apuesta) {
		int num = 0;
		Connection connct = conexion.getConection();
		try {
			PreparedStatement ps = connct.prepareStatement("insert apuestas (c1,c2,c3,c4,c5,c6,compl,reint) values(?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, apuesta.getC1());
			ps.setInt(2, apuesta.getC2());
			ps.setInt(3, apuesta.getC3());
			ps.setInt(4, apuesta.getC4());
			ps.setInt(5, apuesta.getC5());
			ps.setInt(6, apuesta.getC6());
			ps.setInt(7, apuesta.getCompl());
			ps.setInt(8, apuesta.getReint());
			
			num = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public ArrayList<BonolotoModel> listarApuestas() {
		ArrayList<BonolotoModel> lista = new ArrayList<BonolotoModel>();
		Connection connct = conexion.getConection();
		try {
			Statement stmt = connct.createStatement();
			ResultSet rs = stmt.executeQuery("select * from apuestas");
			rs.beforeFirst();
			while(rs.next()) {
				lista.add(new BonolotoModel(rs.getInt("c1"),rs.getInt("c2"),rs.getInt("c3"),rs.getInt("c4"),rs.getInt("c5"),rs.getInt("c6"),rs.getInt("compl"),rs.getInt("reint")));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

}
