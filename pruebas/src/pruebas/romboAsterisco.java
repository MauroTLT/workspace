package pruebas;
import java.util.Scanner;

public class romboAsterisco {

	static final String SEPARACION = " ",CARACT = "*";
public static void main(String[] args) {
	int x = 0, y = 0,numFilas = 0;
	Scanner keyb = new Scanner(System.in);
	do{
		System.out.println("Introduce el numero de filas del rombo, tiene que ser mayor de 0");
		while(!keyb.hasNextInt()) {
			System.out.println("Valor incorrecto");
			keyb.next();
		}
		numFilas = keyb.nextInt();
	}while(numFilas<=0);
	keyb.close();
	numFilas=numFilas*2;
	for(x = 1;x<=numFilas;x = x + 2){//x est� inicializado a uno para que se impriman las lineas impares
		for(int cantEspacios = numFilas-x;cantEspacios>0;cantEspacios--){//la cantidad de espacios es igual a el numero de filas menos el valor de la fila en la que se imprime 10 filas totales - 1(primera fila) 
			System.out.print(SEPARACION);
		}
		for(y = 1;y<=x;y++) {//imprime cifras hasta llegar al numero de la fila en la que estas
			if(y==1 || y==x){
			System.out.print(CARACT + SEPARACION);
			}
			else{
			System.out.print(SEPARACION + SEPARACION);
			}
		}
		System.out.print("\n");
	}
	for(x = 3;x<=numFilas;x = x+2){//x est� inicializado a uno para que se impriman las lineas impares
		for(int cantEspacios = x+numFilas;cantEspacios>numFilas;cantEspacios--){//la cantidad de espacios es igual a el numero de filas menos el valor de la fila en la que se imprime 10 filas totales - 1(primera fila) 
			System.out.print(SEPARACION);
		}
		for(y = numFilas;y>x;y--) {//imprime cifras hasta llegar al numero de la fila en la que estas
			if(y==numFilas || y==x+1){
			System.out.print(CARACT + SEPARACION);
			}
			else{
			System.out.print(SEPARACION + SEPARACION);
			}
		}
		System.out.print("\n");
	}

}

}