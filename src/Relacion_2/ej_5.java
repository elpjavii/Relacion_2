package Relacion_2;
import java.util.Scanner;

public class ej_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero  posicion 1: ");
		int n1 = teclado.nextInt();
		
		System.out.println("letra mayuscula  posicion 1: ");
		char letra1 = Character.toUpperCase(teclado.next().charAt(0));
		
		int  l1 = letra1 - 'A';
		
		
		System.out.println("numero  posicion 2: ");
		int n2 = teclado.nextInt();
		
		System.out.println("letra mayuscula  posicion 2: ");
		char letra2 = Character.toUpperCase(teclado.next().charAt(0));
		
		int  l2 = letra2 - 'A';
	
		int n3 = n2;
		int l3 = l1;
		
		
		int pos1 = n1 - n3;
		int pos2 = l2 - l1;
		
		if(n1 == n2) {
			System.out.println("estan en la misma fila");
		}else if(l1 == l2) {
			System.out.println("estan en la misma columna");
		}else if(pos1 == pos2) {
			System.out.println("estan en la misma diagonal");
		}else {
			System.out.println("ksdjfn");
		}
		
		
		
		
		
		
		
	}

}
