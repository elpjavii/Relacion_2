package Relacion_2;
import java.util.Scanner;

public class ej_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero 1: ");
		int num1 = teclado.nextInt();
		
		System.out.println("numero 1: ");
		int num2 = teclado.nextInt();
		
		System.out.println("numero 1: ");
		int num3 = teclado.nextInt();
		
		if((num1 + num2) > num3 && (num1 + num3) > num2 && (num2 + num3) > num1) {
			System.out.println("si se puede");
		}else {
			System.out.println("no se puede");
		}
	}

}
