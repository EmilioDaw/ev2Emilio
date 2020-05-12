package RecupEv2Daw;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		String mensaje;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		n1 = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		n2 = teclado.nextInt();
		if (n1 == n2) {
			mensaje = "Los dos números son iguales";
		} else if (n1 > n2) {
			mensaje = "El numero " + n1 + " es mayor que " + n2;
		} else {
			mensaje = "El numero " + n2 + " es mayor que " + n1;
		}
		System.out.print(mensaje);
		teclado.close();
	}

}