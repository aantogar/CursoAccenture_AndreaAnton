package src.pruebaInterfacesJava;

public class MainInterfazPrueba {
	

	public static void main(String[] args) {
		InterfazUno objeto=(a,b) ->a + b;
		Pri objetouno=new Pri();
		
		System.out.println(objetouno.cuenta(3, 5));
		
		System.out.println(objeto.cuenta(3, 5));
		System.out.println(objeto.resuelto(20));
		System.out.println(objeto.holi());

		//EJEMPLOS LAMBA
		//(String pepe) -> System.out.println(pepe);
		//(pepe)->System.out::println;

	}

}
