package ejercicio5;

public class Direccion {

	private String dir;
	private String localidad;
	private String codigoPostal;

	public Direccion(String dir, String localidad, String codigoPostal) {
		super();
		this.dir = dir;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return dir + " " + localidad + " " + codigoPostal;
	}

}
