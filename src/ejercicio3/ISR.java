package ejercicio3;

public class ISR extends Impuesto {

	public double calcularImpuesto(double ingresos) {
		double impuesto;
		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		} else {
			impuesto = ingresos * 0.30;
		}
		return impuesto;
	}

}
