
public class InsertionSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,23,56,34,33,89,23,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort(a);
	}
	
	public static void insertionSort(int[] a) {
		
		for(int i=0;i<a.length;i++){
			
			int temp=a[i];
			int k=i-1;
			while(k>=0 && a[k]>temp){
				
				a[k+1]=a[k];
				k--;
			}
			//如果沒執行while回圈，放k+1剛好會放在下一項
			//如果有執行while回圈，因為有k--, 放k+1會放在最前面
			a[k+1]=temp;
			
		}
		
		
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}
	
	

}
