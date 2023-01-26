package fechas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatoFecha {

	public static LocalDate fechaCorrecta(String fecha) {
		LocalDate date=LocalDate.parse(fecha);
		//otra manera
		/*
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");*/
		return date;
	}
	public static LocalDate fechaCorrectaDos(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.parse(fecha, formatter);
		return date;
				
	}
	public static LocalDate fechaCorrectaDos(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate date = LocalDate.parse(fecha, formatter);
		return date;
				
	}
		
	

}
