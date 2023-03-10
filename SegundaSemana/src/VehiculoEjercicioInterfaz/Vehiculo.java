package src.VehiculoEjercicioInterfaz;

public class Vehiculo implements interfazLeerGrabar {
	private int numMarchas;
	private int velocMax;
	private int numChasis;
	private int numRuedas;
	
	public Vehiculo(int numMarchas,int velocidad,int numCh,int ruedas) {
		this.numMarchas=numMarchas;
		this.velocMax=velocidad;
		this.numChasis=numCh;
		this.numRuedas=ruedas;
		accesoBBDD dao=new accesoBBDD();
		dao.Accesograbar(this);
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}


	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}



	@Override
	public void grabar() {
		// TODO Auto-generated method stub
		//convierte dominio a SQL
		
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		//convierte SQL a dominio
		
	}

}
