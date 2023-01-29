package src.figurasEjercicioJava;

public class Figura {

    protected double altura;
    protected double ancho;
    private int y,x,e;
    
    
   
    public void acceder(int num1,int num2, int num3) {
    	Punto punt=new Punto();
    	this.y=num1;
    	this.x=num2;
    	this.e=num3;
    	punt.cambiarCoordenadas(y,x,e);
    }
 
 
    public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}


	public Figura() {
		// TODO Auto-generated constructor stub
	}


	public Figura(double area, double perimetro) {
        this.altura = area;
        this.ancho = perimetro;
    }

 
    public double getArea() {
        return altura;
    }
 
    public void setArea(double altura) {
        this.altura = altura;
    }
 
    public double getPerimetro() {
        return ancho;
    }
 
    public void setPerimetro(double ancho) {
        this.ancho = ancho;
    }

}
