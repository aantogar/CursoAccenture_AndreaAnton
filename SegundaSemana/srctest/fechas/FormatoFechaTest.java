package fechas;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FormatoFechaTest {
	private final String FECHA_UNO="12-10-1980";
	FormatoFecha fecha=new FormatoFecha();

	@Test
	void testFechaCorrecta() {
		assertNotNull(fecha.fechaCorrecta(FECHA_UNO));
	}

	@Test
	void testFechaCorrectaDos() {
		assertNotNull(fecha.fechaCorrecta(FECHA_UNO));
	}
	@Test
	void testFechaCorrectaTres() {
		assertNotNull(fecha.fechaCorrecta(FECHA_UNO));
	}


}
