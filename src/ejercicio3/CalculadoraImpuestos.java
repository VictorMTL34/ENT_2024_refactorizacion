package ejercicio3;

public class CalculadoraImpuestos {

	public static final int IMPUESTO_IVA = 100;
	public static final int IMPUESTO_ISR = 200;
	public static final int IMPUESTO_IEPS = 300;

	public double calcularImpuestoTotal(double ingresos, int CodImpuesto) {

		if (CodImpuesto == IMPUESTO_IVA) {

			return new IVA().calcularImpuesto(ingresos);

		} else if (CodImpuesto == IMPUESTO_ISR) {
			return new ISR().calcularImpuesto(ingresos);
		} else {
			
			return new IEPS().calcularImpuesto(ingresos);
		}

	}
}
