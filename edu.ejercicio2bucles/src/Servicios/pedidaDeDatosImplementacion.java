package Servicios;

import java.util.Scanner;

public class pedidaDeDatosImplementacion implements pedidaDeDatosInterfaz {

	public int pedidaN(Scanner sc) {
		System.out.println("Dame el numero de numeros primos que quieres: ");
		int numero = sc.nextInt();
		return numero;
	}
}
