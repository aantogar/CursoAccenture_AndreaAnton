package src.figurasEjercicioJava;

import java.util.Scanner;

public class Rectangulo extends Figura{

    //atributos
    double alto;
    double ancho;
 
 
    //constructor
    //creo el objeto
 
 
    public Rectangulo(double alto, double ancho) {
        super();
        this.alto = alto;
        this.ancho = ancho;
    }
 
 
    // Getter y setter
    public double getArea() {
 
        return alto*ancho;
    }
 
    public void setArea(double area) {
        this.alto = area;
    }
 
    public double getPerimetro() {
        return alto*2.0+ancho*2.0;
    }
 
 
    public void setPerimetro(double perimetro) {
        this.ancho = perimetro;
    }
 
    public double getAlto() {
        return alto;
    }
 
    public void setAlto(double alto) {
        this.alto = alto;
    }
 
    public double getAncho() {
        return ancho;
    }
 
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

}
