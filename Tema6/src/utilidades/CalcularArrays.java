package utilidades;

public class CalcularArrays {
	public double calcularMaxim(double[] notes) {
		double max = notes[0];
		for(int i = 1; i < notes.length; i++){
			if(max < notes[i]){
				max = notes[i];
			}
		}
		return max;
	}
	public double calcularMinim(double[] notes) {
		double min = notes[0];
		for(int i = 1; i < notes.length; i++){
			if(min > notes[i]){
				min = notes[i];
			}
		}
		return min;
	}
	public double calcularMedia(double[] notes) {
		double suma = 0;
		for(int i = 0; i < notes.length; i++){
			suma = suma + notes[i];
		}
		return suma / notes.length;
	}
}
