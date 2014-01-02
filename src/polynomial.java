public class polynomial {

	// 2x^3 + 2x^2 + 5x^1 + 7x^0
	private static double coefficients1D[] = { 2, 2, 5, 7 };

	// 1*x^0*y^0 + 2*x^0*y^1 + 8*x^0*y^2 + 7*x^1*y^0 + 3*x^1*y^1 + 0*x^1*y^2 + 1*x^2*y^0 +4*x^2*y^1 + 2*x^2*y^2
	private static double coefficients2D[][] = { { 1, 2, 8 }, { 7, 3, 0 }, { 1, 4, 2 } };

	public static void main(String[] args) {

		System.out.println(OneD(coefficients1D, 1.0));// 16
		System.out.println(TwoD(coefficients2D, 2, 3));//235
	}

	private static double OneD(double[] coefficients, double xValue) {
		double result = 0.0;
		for (int i = 0; i < coefficients.length; i++) {

			result = result * xValue + coefficients[i];

		}
		return result;
	}
	//遞推由上而下存取樹
	//like a tree structure
	private static double TwoD(double[][] coefficients, double xValue, double yValue) {

		double resultOfYDimention = 0.0;
		double result = 0.0;

		for (int ix = 0; ix < coefficients.length; ix++) {

			/*the direction is wrong 要從高冪次往低冪次遞推*/
//			for (int iy = 0; iy < coefficients[ix].length; iy++) {
//				resultOfYDimention=resultOfYDimention*yValue+coefficients[ix][iy];
//			}
			
			for (int iy = coefficients[ix].length-1 ; iy >=0 ; iy--) {
				resultOfYDimention=resultOfYDimention*yValue+coefficients[ix][iy];
			}
			result=result+resultOfYDimention*Math.pow(xValue, ix);
			resultOfYDimention = 0.0;//reset
		}

		return result;
	}

}
