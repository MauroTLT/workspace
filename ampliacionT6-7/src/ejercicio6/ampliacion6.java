package ejercicio6;

import java.util.Scanner;

public class ampliacion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		Triangulo arrayT[] = new Triangulo[4];
		Triangulo matriz[][] = new Triangulo[2][2];
		int aux = 0;
        for (int i=0;i < arrayT.length; i++){
        	arrayT[i] = new Triangulo();
        	System.out.println("Escribe el lado del triangulo " + (i+1) + ": ");
        	arrayT[i].setlados(entradaTeclado.nextDouble());
        	System.out.println("Escribe la base del triangulo " + (i+1) + ": ");
        	arrayT[i].setbase(entradaTeclado.nextDouble());
        }
        for(int i=0;i < matriz.length; i++){
        	for(int j=0;j < matriz[i].length; j++){
        		matriz[i][j] = arrayT[aux];
        		aux++;
        	}
        }
        entradaTeclado.close();
        for (int i=0;i < arrayT.length; i++){
        	System.out.println("\nTriangulo " + (i+1));
        	arrayT[i].visualizar();
        }
        System.out.println("El triangulo con mayor area es el: " + Triangulo.areaMayor(arrayT));
        System.out.println("El triangulo con mayor perimetro es el: " + Triangulo.perimetroMayor(matriz));
	}
}
