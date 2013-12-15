public class polynomial {

	// 2x^3 + 2x^2 + 5x^1 + 7x^0
	private static double coefficients1D[] = { 2, 2, 5, 7 };

	public static void main(String[] args) {

		System.out.println(OneD(coefficients1D, 1.0));// 16
	}

	private static double OneD(double[] coefficients, double xValue) {
		double result = 0.0;
		for (int i = 0; i < coefficients.length; i++) {

			result = result * xValue + coefficients[i];

		}
		return result;
	}

	private static double TwoD(double coefficients,double xvalue,double yValue) {

		return 1.0;
	}

}
