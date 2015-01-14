package alumno;

/**
 * Clase que representa un alumno de CFGS DAM
 * @author javier
 * @version 0.0
 */
public class Alumno {
	//atributos
	private String nombre;
	private String nif;
	private int edad;
	
	/**
	 * Constructor que crea alumnos pasando los tres argumentos
	 * @param nombre
	 * @param nif
	 * @param edad
	 */
	public Alumno(String nombre, String nif, int edad) {
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Alumno() {
	}
	
	/**
	 * getter para obtener nombre
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * metodo para cambiar nombre del alumno
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * metodo para obtener el nif del alumno
	 * @return nif como String
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * metodo para cambiar el nif
	 * @param nif
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno nombre=" + nombre + ", nif=" + nif + ", edad=" + edad;
	}
	
	/**
	 * metodo para averiguar si el alumno es mayor de edad
	 * @return true si es mayor de edad
	 */
	public boolean esMayorEdad(){
		return this.edad>=18;
	}
	
	
	

}
