package src.rehacerEjercicioJava;

public class ArraysPrimeraClase {
	public static void main(String[]args) {
		
		System.out.println("EJERCICIOS DE CLASE");
		/**
		 * Estamos probando como funcionan los arrays
		 */
		int[][]elMes= new int[2][7];
		elMes[0][0]=0;
		elMes[0][1]=1;
		elMes[0][2]=2;
		elMes[0][3]=3;
		elMes[0][4]=4;
		elMes[0][5]=5;
		elMes[0][0]=6;
		elMes[0][0]=7;
		
		elMes[1][0]=8;
		elMes[1][0]=9;
		elMes[1][0]=10;
		elMes[1][0]=11;
		elMes[1][0]=12;
		elMes[1][0]=13;
		elMes[1][0]=14;
		
		//Visualizar el valor de una posición
		System.out.println(elMes[1].length);
		String vida="";
		//comprobar la funcionalidad de instanceof
		boolean resultado=(vida instanceof String);
		System.out.println(resultado);
				
	}

}
