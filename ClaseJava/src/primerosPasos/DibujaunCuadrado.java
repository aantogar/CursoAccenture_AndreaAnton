package primerosPasos;

public class DibujaunCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Función realizada para dibujar un cuadrado con un asterisco;
		 */
		System.out.println("Ejercicio de dibujar CUADRADO: \n");
		int n=8;
		int fila=8, col=8;
		 for (fila=1; fila<=n; fila++)
		 {
		 for (col=1; col<=n; col++)
		 System.out.print ("* ");
		 System.out.println ("");
		 }

	}

}
