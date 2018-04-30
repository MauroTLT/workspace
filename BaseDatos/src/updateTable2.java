import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateTable2 {

	public static void main(String[] args) {
		conexionBase conexion = new conexionBase();
		Connection connect = conexion.conectar();
		
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement();
			result = stmt.executeQuery("select * from Alumnos");
			
			while(result.next()) {
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getString("nombre")+" ");
				System.out.print(result.getString("sexo")+" ");
				System.out.print(result.getString("date")+" ");
				System.out.println();
			}
			
			System.out.println(stmt.execute("UPDATE m_prueba.Alumnos SET sexo = 'H' WHERE id = 2"));
			System.out.println(stmt.getUpdateCount());
			
			stmt.execute("select * from Alumnos");
			result = stmt.getResultSet();
			System.out.println("\nUPDATE COMPLETE");
			while(result.next()) {
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getString("nombre")+" ");
				System.out.print(result.getString("sexo")+" ");
				System.out.print(result.getString("date")+" ");
				System.out.println();
			}
			PreparedStatement ps = connect.prepareStatement("UPDATE m_prueba.Alumnos SET nombre = 'manoloX' WHERE id > ? AND id < ?");
			ps.setInt(1,2);
			ps.setInt(2,5);
			System.out.println(ps.executeUpdate());
			stmt.execute("select * from Alumnos");
			result = stmt.getResultSet();
			
			while(result.next()) {
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getString("nombre")+" ");
				System.out.print(result.getString("sexo")+" ");
				System.out.print(result.getString("date")+" ");
				System.out.println();
			}
			
			stmt.close();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}