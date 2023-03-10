package src.figurasEjercicioJava;

import java.util.Scanner;

public class Circulo extends Figura{
	private double radio;
	 
	public Circulo(double radio) {
		this.radio = radio;
		calcularArea(radio);
		calcularPerimetro();
	}
 
	public void calcularArea(double radio) {
        this.radio = radio;
		altura = Math.PI * Math.pow(radio, 2);
	}
 
	public void calcularPerimetro() {
		ancho = 2 * Math.PI * radio;
	}
	public void setCirculo(double radio) {
        this.radio =radio;
	}
	public double getRadio() {
		return radio;
	}

}
