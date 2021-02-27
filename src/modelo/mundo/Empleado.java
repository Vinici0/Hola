package modelo.mundo;

public class Empleado extends Persona{
	
	private String cargo;
	private double sueldo;
	

public String getCargo() {
	return cargo;
}


public double getSueldo() {
	return sueldo;
}


public void setCargo(String cargo) {
	this.cargo = cargo;
}


public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}


public Empleado(String nombre, int cedula, String cargoE1, double sueldoE1) {
		
		super (nombre, cedula);
		this.cargo = cargoE1;
	    this.sueldo = sueldoE1;
	    
	    
	    
	}


@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", cedula = " + cedula + ", cargo = "+ cargo + ", sueldo=" + sueldo +   "]";
}
	
}
