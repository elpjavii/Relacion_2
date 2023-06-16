package Relacion_2;
import java.util.Scanner;

public class ej_9v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sueldo:  ");
		float sueldo = teclado.nextFloat();
		
		System.out.println("Numero hijos:  ");
		int hijos = teclado.nextInt();
		
		double descuento = 0;
		double x = 0;
		
		if(sueldo <= 1000) {
			System.out.println("impuesto no aplicable");
		}else if(sueldo > 1000 && sueldo <= 1600){
			x =  1600 - sueldo;
			descuento = x * (5 - hijos)/100;
		}else if (sueldo > 1600 && sueldo <= 3000) {
			x = (3000 - sueldo) + 600;
			descuento = x * (10 - hijos)/100;
		}else if(sueldo > 3000 && sueldo <= 4600) {
			x = (4600 - sueldo) + 1400 + 600;
			descuento = x * (15 - hijos)/100;

		}else {
			x = 600 + 1400 + sueldo;
			descuento = x * (20 - hijos)/100;

		}
		System.out.println("El descuento es de "+descuento);
	}

}
