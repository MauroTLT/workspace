package enemigo;

public class Casilla {
	
	private Enemigo enemy;
	private Personaje per;
	
	public Casilla() {
		this.enemy = null;
		this.per = null;
	}

	public Enemigo getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemigo enemy) {
		this.enemy = enemy;
	}

	public Personaje getPer() {
		return per;
	}

	public void setPer(Personaje per) {
		this.per = per;
	}
	
}
