import java.util.Scanner;

public class practica6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores= new int[5];
		int valoresleidos= 0;
		int i = 0;
		boolean acabar = false;
		Scanner lector = new Scanner (System.in);
		System.out.println("Escribe " + valores.length + " enteros");
		while (valoresleidos < valores.length && acabar == false){
			if (acabar == false)
				if (lector.hasNextInt()){
					i =lector.nextInt();
					if (i == -1){
						acabar = true;
					}
					else {
						valores[valoresleidos] = i;
						System.out.println("Valor " + valoresleidos + " leido " + valores[valoresleidos]);
						valoresleidos++;
					}
				}
				else{
					System.out.println("Error escribe otra vez");
					lector.next();
				}
			if (acabar == true){
				System.out.println("Ya se han leido " + valoresleidos + " valores");
				System.out.println(valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
			}
		}
		lector.close();
		if (acabar == false){
			System.out.println("Ya se han leido " + valoresleidos + " valores");
			System.out.println(valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
		}
	}

}