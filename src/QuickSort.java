import java.util.Random;

public class QuickSort {

	/**
	 * @param args
	 */
	static int[] a = {3,14,1,34,21,56,35,33,89,23,12};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(a, 0, a.length - 1);
	}

	// sort in-place
	public static void quickSort(int[] a, int leftIndex, int rightIndex) {
		
		int leftTemp = leftIndex;// 找大於middleValue
		int rightTemp = rightIndex;// 找小於middleValue
		int middleValue = a[(leftIndex + rightIndex) / 2];
		
		while (leftTemp < rightTemp) {// 未交錯的情況下

			while (a[leftTemp] < middleValue) {
				leftTemp++;
			}

			while (a[rightTemp] > middleValue) {
				rightTemp--;
			}

			// 找到時，若leftTemp和rightTemp兩邊未交錯則交換內容來排序
			if (leftTemp <= rightTemp) {

				System.out.println(a[leftTemp] + "和" + a[rightTemp] + "互換");
				int temp = a[leftTemp];
				a[leftTemp] = a[rightTemp];
				a[rightTemp] = temp;

				leftTemp++;
				rightTemp--;
			}

		}
		// 剛好相等的話
		if (leftTemp == rightTemp) {
			quickSort(a, leftIndex, leftTemp - 1);
			quickSort(a, rightTemp+1, rightIndex);
		}

		// 交錯後
		// 先排左邊
		if (leftIndex < rightTemp) {
			// leftTemp已經是大於middleValue的位置了（從leftIndex走到leftTemp然後break到這裡）
			// 在讓下一輪的leftTemp走到的話會變成無窮迴圈,所以要leftTemp-1
			quickSort(a, leftIndex, leftTemp - 1);
		}
		// 在排右邊
		if (rightIndex > leftTemp) {
			// rightTemp已經是小於middleValue的位置了
			quickSort(a, rightTemp + 1, rightIndex);
		}

		for (int j = 0; j < a.length; j++) {

			System.out.print(a[j] + ",");
		}
		System.out.println("");
	}

}
