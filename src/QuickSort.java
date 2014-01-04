
public class QuickSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,23,56,34,33,89,23,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(a);
	}
	
	public static void quickSort(int[] a) {
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}

}
