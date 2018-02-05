package ejercicio6;

public class Triangulo {
	private double lados;
	private double base;
	
	public Triangulo(){
		
	}
	
	public Triangulo(double lados, double base){
		this.lados = lados;
		this.base = base;
	}
	
	public double getlados() {
		return lados;
	}
	
	public void setlados(double lados) {
		this.lados = lados;
	}
	
	public double getbase() {
		return base;
	}
	
	public void setbase(double base) {
		this.base = base;
	}
	
	public void visualizar(){
		System.out.println("Lados: " + this.lados);
		System.out.println("Base: " + this.base);
		System.out.println("Area: " + this.area());
		System.out.println("Perimetro: " + this.perimetro());
		
	}
	
	public double area(){
		return (base * (Math.sqrt( (Math.pow(lados, 2) - (Math.pow(base, 2) / 4)) ))) / 2;
	}
	
	public double perimetro(){
		return 2 * lados + base;
	}
	
	public static int perimetroMayor(Triangulo[][] matriz) {
		double aux = 0;
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				if(matriz[i][j].perimetro() < aux){
				} else{aux = matriz[i][j].perimetro();}
			}
			
		}
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				if(matriz[i][j].perimetro() == aux){
					aux = i ;
				}
			}
		}
		return (int) aux;
	}

	public static int areaMayor(Triangulo[] arrayT){
		double aux = 0;
		for(int i = 0; i < arrayT.length; i++){
			if(arrayT[i].area() < aux){
			} else{aux = arrayT[i].area();}
		}
		for(int i = 0; i < arrayT.length; i++){
			if(arrayT[i].area() == aux){
				aux = i + 1;
			}
		}
		return (int) aux;
	}
}
