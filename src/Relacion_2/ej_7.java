package Relacion_2;
import java.util.Scanner;

public class ej_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame el año: ");
		int anio = teclado.nextInt();
		
		if(anio % 4 == 0) {
			if(anio % 100 == 0) {
				System.out.println("no es bisiesto");
			}
			System.out.println("es bisiesto");
		}else {
			System.out.println("no es bisiesto");
		}
	}

}
