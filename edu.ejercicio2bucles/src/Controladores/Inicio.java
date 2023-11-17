package Controladores;

import java.util.Scanner;

import Servicios.pedidaDeDatosImplementacion;
import Servicios.pedidaDeDatosInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pedidaDeDatosInterfaz pdd = new pedidaDeDatosImplementacion();
		int n = pdd.pedidaN(sc);
		
		if(n>0) {
			int control;
			System.out.println("El numero: 1 es primo");
			System.out.println("El numero: 2 es primo");
			for(int i = 3 ; i <= n ; i++ ) {
				control = 0;
				for(int j = 2 ; j < i ; j++ ){
					if(i%j == 0) {
					control = 1;
						break;
					}
				}
				if (control == 0) {
					System.out.println("El numero: " + i + " es primo");
				}
			}
			
			
			
		}else {
			System.out.print("El numero es menor que 1: ");
		}

	}

}
