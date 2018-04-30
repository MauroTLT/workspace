package Ejercicio1;

public interface CensoDAO {
	
	public void insertPersona();
	public void removePersona(int dni);
	public Persona consulta(int dni);
	public void modify(int dni, int tupla, String cambio);
}
