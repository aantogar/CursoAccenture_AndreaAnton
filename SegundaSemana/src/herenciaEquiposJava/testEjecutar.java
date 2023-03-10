package src.herenciaEquiposJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class testEjecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Futbolista> lista = new ArrayList<>();
		lista.add( new Futbolista("Antonio", "Lopez Zamora", 29,7 , "delantero"));
		Iterator itr=lista.iterator();//getting the Iterator  
		System.out.println(lista.get(0));
		  while(itr.hasNext()){
		   System.out.println(itr.next());
	
		  }  
		//también se puede hacer con lambda
		  lista.forEach(str->System.out.println(str));
		  Trabajador[]lista1=new Trabajador[5];
		  
		  lista1[0]=new Futbolista("Antonio", "Lopez Zamora", 29,7 , "delantero");
		  lista1[1]=new Masajita("Rosa", "Garcia Garcia", 19,"fisioterapeuta" , 8);
		  lista1[2]=new Masajita("Lara", "Moralo Herranz", 49,"terapeutica" , 18);
		  lista1[3]=new Entrenador("Jose", "Lopez Lopez", 38," española");
		  lista1[4]=new Entrenador("Toni", "Morato Bucci", 28," argentina");
		  
		  for (Trabajador actual: lista1) {
			  if(actual!=null) {
				  actual.concentrarse();
				  if(actual instanceof Futbolista) {
					  Futbolista pp=(Futbolista)actual;
					  pp.jugarPartido();
					  pp.entrenar();
					  pp.concentrarse();
					  pp.viajar();
				  }else if(actual instanceof Entrenador) {
					  Entrenador ee=(Entrenador)actual;
					  ee.dirigirPartido();
					  ee.dirigirEntrenamiento();
					  ee.viajar();
				  }else if(actual instanceof Masajita) {
					  Masajita mm=(Masajita)actual;
					  mm.darMasaje();
					  
				  }else {
					  System.out.println("No existe en la lista.");
				  }
			  }else {
				  System.out.println("No existe en la lista");
			  }
			  
		  }
		
	}

}
