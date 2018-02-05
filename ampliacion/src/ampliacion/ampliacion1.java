package ampliacion;

import java.util.Scanner;

public class ampliacion1 {
    public static void main(String[] args) {
        int numero = 0;
        int a = 0;
        int b = 0;
        String espacio = " ";
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("¿Cuantas filas quieres?");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();

        numero = numero + numero;
        for (a = 1; a <= numero; a = a + 2) {
            for (int espacios = numero - a; espacios > 0; espacios--)
                System.out.print(espacio);
            
            for (b = 1; b <= a; b++) {

                if (b % 2 == 0)
                    System.out.print("2" + espacio);

                if (b % 2 != 0)
                    System.out.print("1" + espacio);
            }
        System.out.println();
        }

    }
}

