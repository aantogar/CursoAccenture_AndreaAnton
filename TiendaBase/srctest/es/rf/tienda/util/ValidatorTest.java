package es.rf.tienda.util;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ValidatorTest {
	Validator validator;
	
	private final String ALFA_NUM="Jjdshfjsdhf90";
	private final String PHONE_NUM="987 67 8911";
	private final int MIN_PHONE=10;
	private final int MAX_PHONE=20;
	private final String EMAIL="andrea@hola.com";
	private final String DNI_BUENO="26.752.080-K";
	private final int VALOR_MIN=4;
	private final int VALOR_MAX=10;
	private final int VALOR_TEST=5;
	private final double VALOR_TESTB=5D;
	private final String VALOR_STR="Hola estamos en test";
	private final int MIN_STR=4;
	private final int MAX_STR=20;
	private final String EMPTY_STR="";
	private final String FORMATO_BARRA="dd/MM/yyyy";
	private final String FECHA_VALIDA="20/02/2023";
	private final LocalDate DATE_DATE=LocalDate.of(2020, 10, 02);
	private final LocalDate DATE_MIN=LocalDate.of(1993, 10, 18);
	private final LocalDate DATE_MAX=LocalDate.of(2023, 12,9);
	private final String PASSWORD_TRUE="1@Holacomhola";
	
	
	
	
	@Test
	
	void testIsVacio(){
		assertNotNull(Validator.isVacio(EMPTY_STR));
	}
	
	@Test
		
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(ALFA_NUM));
	}

	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(PHONE_NUM, MIN_PHONE, MAX_PHONE));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.isEmailValido(EMAIL));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DNI_BUENO));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(VALOR_TEST, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(VALOR_TESTB, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin(VALOR_STR, VALOR_MIN));
	}

	@Test
	void testCumpleLongitudMax() {
		assertTrue(Validator.cumpleLongitudMax(VALOR_STR, MAX_STR));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Validator.cumpleLongitud(VALOR_STR, MIN_STR, MAX_STR));
	}

	@Test
	void testValDateMin() {
		assertTrue(Validator.valDateMin(DATE_DATE, DATE_MIN));
	}

	@Test
	void testValDateMax() {
		assertTrue(Validator.valDateMax(DATE_DATE, DATE_MAX));
	}

	@Test
	void testEsFechaValidaString() {
		assertTrue(Validator.esFechaValida(FECHA_VALIDA, FORMATO_BARRA));
	}

	@Test
	void testEsFechaValidaStringString() {
		assertTrue(Validator.esFechaValida(FECHA_VALIDA, FORMATO_BARRA));
	}

	@Test
	void testEsPasswordValida() {
		assertTrue(Validator.esPasswordValida(PASSWORD_TRUE));
	}

}