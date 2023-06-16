package Relacion_2;

import java.util.Scanner;

public class ej_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1: suma");
		System.out.println("2: resta");
		System.out.println("3: multiplicacion");
		System.out.println("4: division");
		System.out.println("5: raiz cuadrada");
		int v = teclado.nextInt();
		int n1 = 0,n2 = 0;
		double resu = 0;
		if (v != 5) {
			System.out.println("numero 1: ");
			n1 = teclado.nextInt();
			
			System.out.println("numero 2: ");
			n2 = teclado.nextInt();
		}
		

		switch(v) {
		case 1:
			resu = n1 + n2;
			break;
		case 2:
			resu = n1 - n2;
			break;
		case 3:
			resu = n1 * n2;
			break;
		case 4:
			resu = n1 / n2;
			break;
		case 5:
			System.out.println("numero para hacer raiz: ");
			n1 = teclado.nextInt();
			resu = Math.sqrt(n1);
			break;
		}
		System.out.println(resu);
	}

}
