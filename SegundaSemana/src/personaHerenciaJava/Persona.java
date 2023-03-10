package src.personaHerenciaJava;

public abstract class Persona {
	private String codPersona;
	private String nombre;
	private int edad;
	private String telContacto;
	
	public Persona() {
		
	}
	public Persona(String codigo, String nombre,int edad, String telefono) {
		this.codPersona=codigo;
		this.nombre=nombre;
		this.edad=edad;
		this.telContacto=telefono;
	}
	public String getCodPersona() {
		return codPersona;
	}
	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelContacto() {
		return telContacto;
	}
	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}
	public void mostrar() {
		System.out.println("\nLos atributos de la clase son, "+ "código: "+getCodPersona()+
				", nombre: "+getNombre()+", edad: "+getEdad()+ " y teléfono: "+getTelContacto()+".");
	}

}
