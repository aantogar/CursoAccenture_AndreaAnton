package creandoFicherosPracticas;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TeoriayPracticas {
	
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2;
		System.out.println("Introduce un número: ");
		n1=teclado.nextInt();
		System.out.println("Introduce un número: ");
		n2=teclado.nextInt();
		System.out.format("Primer número %d y segundo %d ",n1,n2);
		/**
		 * Usando try catch resource en lugar de try cacth finally
		 */
		File fichero=new File("C:\\Users\\andrea.anton.garcia\\AreadeTrabajo\\PracticasEnCasa\\src\\bancoAppPracticarJava\\Credito.java");
		try(Scanner leerfichero=new Scanner(fichero)){
			//en vez de utilizar nextLine, puedo...
			leerfichero.useDelimiter("\n");
			while(leerfichero.hasNext()) {
				String cadena=leerfichero.next();
				System.out.print(cadena +"");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		/**
		 * Practicando con FileWriter
		 */
		FileWriter ficheroDos=null;
		PrintWriter pw=null;
		try {
			ficheroDos=new FileWriter("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\prueba.txt",true);
			pw=new PrintWriter(ficheroDos);
			for (int i=0;i<10;i++)
				pw.println("Linea "+i);
		}catch(Exception e) {
		e.printStackTrace();
		}
		finally {
			try {
				if(null!=ficheroDos)
					ficheroDos.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	

	}

}
