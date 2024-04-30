package ejercicio5;

public class Cliente {
	private String nombre;
	private String apellido;
	private Direccion direccion;

	// Getters y setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void cambiarDireccion(String nCodPostal, String nDireccion, String nLocalidad) {
		direccion.setDir(nDireccion);
		direccion.setCodigoPostal(nCodPostal);
		direccion.setLocalidad(nLocalidad);
	}

	public String getDireccion() {

		return direccion.toString();
	}

}
