package Ejercicio1;

public interface CensoDAO {
	
	public void insertPersona(Persona persona);
	public void removePersona(String dni);
	public Persona consulta(String dni);
	public void modify(String dni, String tupla, String cambio);
}
