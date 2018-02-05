
public class practica16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int SW = 0;
		float aux = 0F;
		float media = 0F;
		float max = 0F;
		float[][] arrayBi = {
				{ 6.0F, 7.2F, 2.3F, 5.8F, 3.4F },
				{ 7.8F, 1.6F, 4.6F, 9.4F, 3.1F },
				{ 3.6F, 1.4F, 8.9F, 3.5F, 6.5F },
				{ 2.5F, 3.0F, 10.0F, 2.4F, 8.9F },
		};
		for (i = 0; i < arrayBi.length; i++) {
			for (j = 0; j < arrayBi[i].length; j++) {
				aux += arrayBi[i][j];
				if (media < aux / 5 && j == 4) {
					aux = aux / 5;
					media = aux;
					if (i == 0) {
						SW = 1;
					} else if (i == 1) {
						SW = 2;
					} else if (i == 2) {
						SW = 3;
					} else if (i == 3) {
						SW = 4;
					}
				}
			}
			aux = 0;
		}
		switch (SW) {
		case 1:
			System.out.println("La mayor media es de Espinete: " + media);
			break;
		case 2:
			System.out.println("La mayor media es de Don Pinpon: " + media);
			break;
		case 3:
			System.out.println("La mayor media es de Gustavo: " + media);
			break;
		case 4:
			System.out.println("La mayor media es de Triki: " + media);
			break;
		default:
			System.out.println("Error");
			break;
		}
		for (i = 0; i < arrayBi.length; i++) {
			for (j = 0; j < arrayBi[i].length; j++) {
				if (arrayBi[i][j] > max) {
					max = arrayBi[i][j];
					if (i == 0) {
						SW = 1;
					} else if (i == 1) {
						SW = 2;
					} else if (i == 2) {
						SW = 3;
					} else if (i == 3) {
						SW = 4;
					}
				}
			}
		}
		switch (SW) {
		case 1:
			System.out.println("La nota mayor es de Espinete con un " + max);
			break;
		case 2:
			System.out.println("La nota mayor es de Don Pinpon con un " + max);
			break;
		case 3:
			System.out.println("La nota mayor es de Gustavo con un " + max);
			break;
		case 4:
			System.out.println("La nota mayor es de Triki con un " + max);
			break;
		}
	}
}