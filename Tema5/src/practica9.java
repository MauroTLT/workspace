
public class practica9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica9 programa = new practica9();
		programa.inicio();
		
	}
	public void inicio(){
		imprimir(10);
		imprimir(8);
		imprimir(34);
	}
	public void imprimir(int numero){
		for(int i = 0; i < numero; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
