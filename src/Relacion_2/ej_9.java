package Relacion_2;
import java.util.Scanner;

public class ej_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sueldo:  ");
		float sueldo = teclado.nextFloat();
		
		System.out.println("Numero hijos:  ");
		int hijos = teclado.nextInt();
		
		double descuento = 0;
		
		if(sueldo <= 1000) {
			System.out.println("impuesto no aplicable");
		}else if(sueldo > 1000 && sueldo <= 1600){
			descuento = sueldo * (5 - hijos)/100;
		}else if (sueldo > 1600 && sueldo <= 3000) {
			descuento = sueldo * (10 - hijos)/100;
		}else if(sueldo > 3000 && sueldo <= 4600) {
			descuento = sueldo * (15 - hijos)/100;

		}else {
			descuento = sueldo * (20 - hijos)/100;

		}
		System.out.println("El descuento es de "+descuento);
	}

}
