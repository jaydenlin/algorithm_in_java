
public class SelectionSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,21,56,35,33,89,23,12};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort(a);

	}
	
	public static void selectionSort(int[] a) {
		int index=0;//保存最小值的index
		for(int i=0;i<a.length;i++){
			
			//for迴圈的變形，當有可能會超過範圍時用while
			int indexAfterTheI=i+1;
			while(indexAfterTheI<a.length){
				
				if(a[indexAfterTheI]<a[index]){
					
					index=indexAfterTheI;//更新index
				}
				
				indexAfterTheI++;
			}
			
			//switch
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			
			
		}
		
		
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}
	
}
