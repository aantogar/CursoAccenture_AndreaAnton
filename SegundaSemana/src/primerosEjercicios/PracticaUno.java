package src.primerosEjercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticaUno {

	public static void main(String[] args) {
/**
 * Primera practica de colecciones
 * viendo formas de hacerlo
 */
		// Declaración el ArrayList
		List<String>  coches= new ArrayList<String>();

		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			coches.add("coche "+i); 
		}

		// Añadimos un nuevo elemento al ArrayList en la posición 2
		coches.add(2, "coche 3");

		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = coches.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
	
			}
		String busqueda = "coche 1";
		boolean existe = coches.contains(busqueda);
		if (existe) {
			System.out.println("\nEl elemento SÍ existe en la lista");
		} else {
			System.out.println("\nEl elemento no existe");
		}
		String busqueda1 = "coche 27";
		int indice = coches.indexOf(busqueda1);
		if (indice != -1) {
			System.out.println("La búsqueda está en el índice " + indice);
		} else {
			System.out.println("El elemento no existe");
		}

	}

}
