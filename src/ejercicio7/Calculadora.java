package ejercicio7;

public class Calculadora {

	public static final int MODO_SUMAR = 1;
	public static final int MODO_RESTAR = 2;
	public static final int MODO_MULTI = 3;
	public static final int MODO_DIV = 4;

	public int operar(int modo, int a, int b) throws Exception {
		switch (modo) {
		case 1:

			return a + b;

		case 2:
			return a - b;

		case 3:
			return a * b;

		case 4:
			if (b == 0) {
				throw new Exception("No se pude dividir por 0");

			}
			return a / b;

		default:
			return b + a;

		}

	}

	public double calcularAreaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	public double calcularVolumenCilindro(double radio, double altura) {
		return calcularAreaCirculo(radio) * altura;
	}
}
