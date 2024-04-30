package ejrecicio6;

public abstract class Animal {
	private String tipo;

	public Animal(String tipo) {
		this.tipo = tipo;
	}

	public abstract String hacerRuido();
}
