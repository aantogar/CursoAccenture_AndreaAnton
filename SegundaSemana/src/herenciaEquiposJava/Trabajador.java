package src.herenciaEquiposJava;

public abstract class Trabajador {
	private int id;
	private static int contador=0;
	private String apellidos;
	private String nombre;
	private int edad=0;

	
	public Trabajador() {
		setId();
		
	}
	
	public Trabajador(String nombre,String apellidos,int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		setId();
	}

	public int getId() {
		return contador;
	}

	public void setId() {
		contador++;
	}


	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public void concentrarse(){
		System.out.println("El trabajador con nombre: "+getNombre()+
				"esta muy concentrado en su trabajo.");
		
	}
	
	public void viajar(){
		System.out.println("El trabajador con nombre: "+getNombre()+""
				+ " está viajando en estos momentos.");
		
	}
	
	

}
