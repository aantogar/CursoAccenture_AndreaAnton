package src.fechasJava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class FormatoFecha {

	public static LocalDate fechaCorrecta(String fecha) {
		LocalDate date=LocalDate.parse(fecha);
		return date;
	}
	
	public static LocalDate fechaCorrectaDos(String fecha) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
	     LocalDate date = LocalDate.parse(fecha, formatter);
		return date;			
	}
	
	public static LocalDate fechaCorrectaTres(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd",Locale.US);
		LocalDate date = LocalDate.parse(fecha, formatter);
		return date;
	}

	public static LocalDateTime fechaCorrectaCuatro(String fecha) {
		DateTimeFormatter formateador = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("d/MM/yyyy")).toFormatter();
		LocalDateTime date = LocalDateTime.parse(fecha, formateador);
		return date;
	}

}
