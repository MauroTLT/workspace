package ampliacionT8;

import java.util.ArrayList;

public class Estudiante extends Persona {
	private ArrayList <String> cursos;

	public Estudiante(String nombre, String apellidos, String dni, String estadoCivil, String curso) {
		super(nombre, apellidos, dni, estadoCivil);
		cursos = new ArrayList <String>();
		this.cursos.add(curso);
	}
	
	public void matricular(String curso) {
		if(this.cursos.contains(curso)) {
		} else {this.cursos.add(curso);}
	}

	public ArrayList<String> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<String> cursos) {
		this.cursos = cursos;
	}

	public String toString() {
		return "Estudiante [cursos=" + cursos + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", estadoCivil=" + estadoCivil + "]";
	}
	
}
