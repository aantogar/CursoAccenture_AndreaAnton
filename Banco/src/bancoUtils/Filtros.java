package bancoUtils;

import java.time.LocalDate;

public class Filtros {
	
	public static boolean Filtername(String name,int min,int max)throws Exception {
		if(name.length()< min || name.length()> max)
			throw new Exception("El nombre ha superado los límites mínimos o máximos");
		return true;	
	}
	public static boolean FilterDate(LocalDate fecha) throws Exception {
		fecha=LocalDate.now();
		if(fecha.getYear()< 3 || fecha.getYear() >5)
			throw new Exception("La fecha de vencimiento no es correcta");
		return true;
	}
	public static boolean Filterconcept(String concepto, double x,int min,int max) throws Exception {
		if(concepto.length()< min || concepto.length()> max)
			throw new Exception("El nombre ha superado los límites mínimos o máximos");
		return true;
		
	}

}
