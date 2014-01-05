
public class InsertionSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,21,56,35,33,89,23,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort(a);
	}
	
	public static void insertionSort(int[] a) {
		
		for(int i=0;i<a.length;i++){
			
			int temp=a[i];
			int indexBeforeTheI=i-1;
			while(indexBeforeTheI>=0 && a[indexBeforeTheI]>temp){//這樣寫可以省一個迴圈
				
				a[indexBeforeTheI+1]=a[indexBeforeTheI];
				indexBeforeTheI--;
			}
			//如果沒執行while回圈，放indexBeforeTheI+1剛好會放在下一項
			//如果有執行while回圈，因為有indexBeforeTheI--, 放indexBeforeTheI+1會放在最前面
			a[indexBeforeTheI+1]=temp;
			
		}
		
		
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}
	
	

}
