package RecupEv2Daw;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		String mensaje;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		numero2 = teclado.nextInt();
		mensaje = comprueba(numero1, numero2);
		System.out.print(mensaje);
		teclado.close();
	}

	/**
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	public static String comprueba(int numero1, int numero2) {
		String mensaje;
		if (numero1 == numero2) {
			mensaje = "Los dos números son iguales";
		} else if (numero1 > numero2) {
			mensaje = "El numero " + numero1 + " es mayor que " + numero2;
		} else {
			mensaje = "El numero " + numero2 + " es mayor que " + numero1;
		}
		return mensaje;
	}

}