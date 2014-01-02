public class bagProblem {

	/**
	 * @param args
	 */
	static int itemNumber = 4;
	static int[] weight = { 2, 1, 3, 2 };
	static int[] value = { 3, 2, 4, 2 };
	static int limitWeight = 5;
	static int sumValue = 0;//outside value 樹狀結構的[暫時解]通常存在外部
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carry(0, 0);

	}

	private static void carry(int itemIndex, int sumWeight) {
		//前序拜訪的變形
		if (itemIndex == itemNumber) {
			System.out.println(sumValue);
		} else if ((weight[itemIndex] + sumWeight) <= limitWeight) {
			//先visit，即修改外部值sumValue
			sumValue = Math.max(sumValue, sumValue + value[itemIndex]);//save the greater one to outside 比較每個[葉]
			//拜訪一分支
			carry(itemIndex + 1, sumWeight + weight[itemIndex]);
		} else {
			//或拜訪另一分支
			carry(itemIndex + 1, sumWeight);
		}
	}

}
