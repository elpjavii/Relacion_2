package Relacion_2;
import java.util.Scanner;

public class ej_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("a  1: ");
		int n1 = teclado.nextInt();
		
		System.out.println("b  1: ");
		int n2 = teclado.nextInt();
		
		System.out.println("c  1: ");
		int n3 = teclado.nextInt();
		
		System.out.println("a  1: ");
		int n4 = teclado.nextInt();
		
		System.out.println("b  2: ");
		int n5 = teclado.nextInt();
		
		System.out.println("c  2: ");
		int n6= teclado.nextInt();
		
		if(n1/n4 != n2/n5) {
			System.out.println("secantes");
		}else if(n1/n2 == -n5/n4) {
			System.out.println("secante");
		}else if(n1/n4 == n2/n5) {
			System.out.println("paralelas");
		}else if(n1/n2 == n4/n5 && n1/n2 == n3/n6) {
			System.out.println("paralela");
		}
	}

}
