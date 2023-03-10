package src.StreamsPruebasJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsPrimerasPruebas {

	public static void main(String[] args) {
		
		int []array1=new int[] {1,2,3,4};
		//ejercicio para mapear números pares
		System.out.println("\nEJERCICIO DE NUMEROS PARES");
		int[]respuesta=Arrays.stream(array1)
				.filter(s->( s%2 ==0))
				.toArray();
		//Ejercicio para contar numeros pares
		System.out.println("\nEJERCICIO DE  COUNT NUMEROS PARES");
		Arrays.stream(respuesta)
		.forEach(x->System.out.println(x));
		long contador=Arrays.stream(array1)
				.filter(s->( s/2 ==0))
				.count();
		//ejercicio iterator 
		System.out.println("\nEJERCICIO DE ITERATOR");
		Stream.iterate(0, n ->n+1)
		.limit(10)
		.forEach(x->System.out.println(x));
		
		//Ejercicio generate
		Random ran=new Random();
		System.out.println("\nEJERCICIO DE GENERATE");
		Stream.generate(() ->ran.nextInt(100))
		.limit(20).forEach(System.out::println);
		
		
		// CON ORELSE
		String name2=("Holi");
		String name3=("Adios");
		Optional<String>name4=Optional.ofNullable(name2);
		name4.ifPresent(nombre->System.out.println(nombre.length()));
		//Otra manera de hacerlo
		System.out.println((Optional.ofNullable(name3).orElse("La vida")));
		
	

				
				
		
	}

}
