package rehacerEjercicio;

import java.util.Scanner;

public class EjerciciosJavaDia2 {
	static int num1;
	static int num2;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRIMER EJERCICIO \n");
		mayorMenorIgual();
		System.out.println("SEGUNDO EJERCICIO: ");
		multiplo();
		

	}
	public static void mayorMenorIgual() {
		System.out.println("COMPARACIÓN DE NÚMEROS");
		System.out.println("Introduce el primer número: ");
		Scanner entrada=new Scanner(System.in);
		num1=entrada.nextInt();
		System.out.println("\nIntroduce el segundo número: ");
		Scanner entrada2=new Scanner(System.in);
		num2=entrada2.nextInt();
		if(num1<num2) {
			System.out.println("El número "+
					num1+" es más pequeño que "+num2);
			
		}else if(num2>num1) {
			System.out.println("El número "+
					num1+" es más mayor que "+num2);
		}else {
			System.out.println("Los números son IGUALES!!");
		}
	}
	public static void multiplo() {
		System.out.println("Introduce el primer número: ");
		Scanner entrada=new Scanner(System.in);
		num1=entrada.nextInt();
		System.out.println("\nIntroduce el segundo número: ");
		Scanner entrada2=new Scanner(System.in);
		num2=entrada2.nextInt();
		if(num1 % num2==0 || num2 % num1==0) {
			System.out.println("Sí,"+num2+ " es múltiplo de "+num1);
		}else {
			System.out.println("No, no es múltiplo");
		}
	}

}
