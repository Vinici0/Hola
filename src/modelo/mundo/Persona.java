package modelo.mundo;

public class Persona {
    /////////////////////////////////////////////////////////////////////
	//Significa que las subclases sí pueden tener acceso al método.
	/////////////////////////////////////////////////////////////////////
	protected String nombre;
	protected int   cedula;
	
	public Persona(String nombre, int cedula) {
		
		this.nombre = nombre;
		this.cedula= cedula;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula +  "]";
	}
	
		
	}
	
