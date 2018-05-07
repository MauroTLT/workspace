package Ejercicio1;

public class UsuarioModel {
	
	private static UsuarioModel usuario = new UsuarioModel();
	private String username, password;
	
	public static UsuarioModel getInstance() {
		return usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
