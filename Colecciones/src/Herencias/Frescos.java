package Herencias;

public class Frescos extends Productos{
	private String pais;
	private String fechaEnv;
	
	public Frescos() {
		super();
	}

	@Override
	public String toString() {
		return "Frescos [pais=" + pais + ", fechaEnv=" + fechaEnv + ", getFechaCaduc()=" + getFechaCaduc()
				+ ", getNumLote()=" + getNumLote() + "]";
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFechaEnv() {
		return fechaEnv;
	}

	public void setFechaEnv(String fechaEnv) {
		this.fechaEnv = fechaEnv;
	}

}