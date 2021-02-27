package modelo.mundo;

public class Estudiante extends Persona {
    
	private String codigo;
	private String email;
	private String carrera;
	
	public Estudiante(String nombre,int cedula,String codigo, String email, String carrera) {
		
		super(nombre, cedula); //ATRIBUTOS DE LA CLASE PADRE 
		this.codigo = codigo;
	    this.email = email;
	    this.carrera = carrera;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getEmail() {
		return email;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		
		return "" + super .toString() + "Estudiante [codigo = " + codigo + ", email = " + email + ", carrera = " + carrera + "]";
	}
	
}
