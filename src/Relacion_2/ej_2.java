package Relacion_2;
import java.util.Scanner;

public class ej_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero 1: ");
		int num1 = teclado.nextInt();
		
		System.out.println("numero 2: ");
		int num2 = teclado.nextInt();

		System.out.println("numero 2: ");
		int num3 = teclado.nextInt();
		
		if (num1 == num2 && num1 == num3) {
			System.out.println("los tres numeros son iguales");
		}else if(num1 <= num2 && num1 <= num3) {
			System.out.println(num1+" mas pequeño");
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println(num2+" mas pequeño");
		}else {
			System.out.println(num3+" mas pequeño");
		}
	}

}
