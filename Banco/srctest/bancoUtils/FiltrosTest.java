package bancoUtils;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ejerciciosBanco.Cuenta;
import junit.framework.Assert;

class FiltrosTest {
	final String NOMBRE_UNO="Andrea Anton";
	final String CONCEPTO_UNO="Esto es una prueba de test";
	final double CANTIDAD_UNO=0.00;
	final double COMPROBAR_CERO=0;
	final LocalDate fecha=LocalDate.of(2022, 10, 01);
	final int fecha_min=2020;
	final int fecha_max=2025;
	final String FECHA_VEINTE="20.12.2020";
	final String FORMATO_PUNTO="dd.MM.yyyy";
	final String FECHA_VEINTEYTRES="2023/12/20";
	final String FORMATO_BARRA="yyyy/MM/dd";
	final String FECHA_CORRECTA="20-12-2023";
	

	@Test
	void testFiltername()  {
		assertTrue(Filtros.Filtername(NOMBRE_UNO,10,21));
	}


	@Test
	void testFilterDate()  {
		assertTrue(Filtros.FilterDate(fecha,fecha_min,fecha_max));
	}

	@Test
	void testFilterconcept()  {
		assertTrue(Filtros.Filtercncept(CONCEPTO_UNO, 10, 30));
	}
	
	@Test
	void testFilterIngresarCantidad() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			Integer.parseInt(CONCEPTO_UNO);
		});
	}
	@Test
	void testFilterRetirarCantidad() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			Integer.parseInt(CONCEPTO_UNO);
		});
	}
	@Test
	void testfechaCorrecta()  {
		assertNotNull(Filtros.fechaCorrecta(FECHA_VEINTE, FORMATO_PUNTO));
	}
	@Test
	void testfechaCorrectaDos()  {
		assertNotNull(Filtros.fechaCorrecta(FECHA_VEINTEYTRES, FORMATO_BARRA));
	}
	@Test
	void testfechaCorrectaOK()  {
		assertEquals(Filtros.fechaCorrecta(FECHA_CORRECTA),LocalDate.of(2023,12, 20));
	}
	//@Repeatedtest(value 5, name="Dates Strings erroneas")

}
