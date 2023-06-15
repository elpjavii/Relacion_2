package Relacion_2;
import java.util.Scanner;

public class ej_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero 1: ");
		int num = teclado.nextInt();
		
		System.out.println("numero 2: ");
		int num2 = teclado.nextInt();
		
		if (num == num2) {
			System.out.println("los dos numeros son iguales");
		}else if(num < num2) {
			System.out.println(num+" mas pequeño que "+num2);
		}else {
			System.out.println(num2+" mas pequeño que "+num);
		}
	}

}
