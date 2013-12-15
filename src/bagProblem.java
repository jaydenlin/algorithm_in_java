public class bagProblem {

	/**
	 * @param args
	 */
	static int itemNumber = 4;
	static int[] weight = { 2, 1, 3, 2 };
	static int[] value = { 3, 2, 4, 2 };
	static int limitWeight = 5;
	static int sumValue = 0;//outside value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carry(0, 0);

	}

	private static void carry(int itemIndex, int sumWeight) {
		
		if (itemIndex == itemNumber) {
			System.out.println(sumValue);
		} else if ((weight[itemIndex] + sumWeight) <= limitWeight) {
			sumValue = Math.max(sumValue, sumValue + value[itemIndex]);//save the greater one to outside
			carry(itemIndex + 1, sumWeight + weight[itemIndex]);
		} else {
			carry(itemIndex + 1, sumWeight);
		}
	}

}
