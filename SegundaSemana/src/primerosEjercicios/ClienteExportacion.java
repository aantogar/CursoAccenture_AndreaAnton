package src.primerosEjercicios;

public class ClienteExportacion extends Cliente{
	private String vat;
	
	
	public ClienteExportacion(String nombre, String direccion,String correo,String vat) {
	super();
	this.setNombre(nombre);
	this.setDirec(direccion);
	this.setCorreo(correo);
	this.setVat(vat);
	}
	public String getVat(){
			return vat;
	}
	public void setVat(String vat) {
	this.vat=vat;	
	}

}
