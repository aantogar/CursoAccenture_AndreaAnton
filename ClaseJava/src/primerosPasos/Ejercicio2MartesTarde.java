package primerosPasos;

public class Ejercicio2MartesTarde {
	static int nota=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EJERCICIO DE VALORACIÓN DE NOTA\n");
		calcula();
		
		
		
	}
	public static void calcula() {
		if(nota<5) {
			System.out.println("Tu nota : "+nota+ "es insuficiente");
		}else if(nota==5) {
			System.out.println("Tu nota : "+nota+ " es suficiente");
		}else if(nota==6) {
			System.out.println("Tu nota : "+nota+ " es un bien");
		}else if(nota==7 || nota==8) {
			System.out.println("Tu nota : "+nota+ " es un notable");
		}else {
		}System.out.println("Tu nota : "+nota+ " es un sobresaliente");
	}

}