package ejercicio2;

import java.util.Scanner;

public class ampliacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		Factura f1 = new Factura();
		System.out.println("Introduce la cantidad: ");
		f1.setCantidad(entradaTeclado.nextFloat());
		System.out.println("Introduce el precio: ");
		f1.setPrecio(entradaTeclado.nextFloat());
		
		System.out.println(f1.calcularVenta());
		entradaTeclado.close();
	}

}
