import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateTable {

	public static void main(String[] args) {
		conexionBase conexion = new conexionBase();
		Connection connect = conexion.conectar();
		
		Statement stmt;
		ResultSet result;
		try {
			stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
			result = stmt.executeQuery("select * from Alumnos");
			result.beforeFirst();
			
			while(result.next()) {
				result.updateString("nombre","batman");
				result.updateRow();
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getString("nombre")+" ");
				System.out.print(result.getString("sexo")+" ");
				System.out.print(result.getString("date")+" ");
				System.out.println();
			}
			stmt.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
