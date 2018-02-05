import java.util.Scanner;
public class practica14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica14 programa = new practica14();
		programa.inicio();
	}
	public void inicio(){
		Scanner entradaTeclado = new Scanner(System.in);
		
		int[] array = { 1, 2, 3, 4, 4, 6, 7, 8, 9, 10};
	
		int busqueda=lectura(entradaTeclado);
		System.out.println("El numero a buscar es: "+busqueda);
		int repetidos=busqueda(array, busqueda);
		System.out.println("Y está "+repetidos+" veces.");
		
		entradaTeclado.close();
	}
	public int lectura(Scanner entradaTeclado){
		System.out.println("Escribe un numero");
		int buscar = 0;
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		buscar = entradaTeclado.nextInt();
		return buscar;
	}
	public int busqueda(int[] array,int busqueda){
		int repetido = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == busqueda){
				repetido += 1;
			}
		}
		return repetido;
	}
}