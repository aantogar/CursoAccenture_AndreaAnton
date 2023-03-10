package src.VehiculoEjercicioInterfaz;

public class Coche extends Vehiculo implements InterfaceUno{
	private String color;
	private int numPuertas;
	private boolean situacion;
	
	public Coche(int numMarchas,int velocidad,int numCh,int ruedas,String color, int numPuertas) {
		super(numMarchas,velocidad,numCh,ruedas);
		this.color=color;
		this.numPuertas=numPuertas;
	}

	@Override
	public String toString() {
		return "El vehículo es un coche de color: " + color + ", tiene: " + numPuertas + " puertas y " + getNumMarchas()
				+ "nº de marchas, su velocidad máxima es de : " + getVelocMax() + " km/h. Nº de chasis: " + getNumChasis() + "y tiene: "
				+ getNumRuedas() + " total de ruedas.";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public  void reductora(boolean activar) {
		situacion=activar;
		// TODO Auto-generated method stub
		
	}

}
