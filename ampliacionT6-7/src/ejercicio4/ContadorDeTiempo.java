package ejercicio4;

public class ContadorDeTiempo {
	private int cont;

	public ContadorDeTiempo(){
		
	}
	
	public ContadorDeTiempo(int cont){
		if(cont >= 0){
			this.cont = cont;
		} else {this.cont = 0;}
	}
	
	public void copia(ContadorDeTiempo copia){
		this.cont = copia.getCont();
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementarTiempo(){
		this.cont++;
	}
	
	public void decrementarTiempo(){
		if(this.cont == 0){
			this.cont = 0;
		} else {this.cont--;}
	}
}
