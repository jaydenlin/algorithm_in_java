
public class BubbleSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,21,56,35,33,89,23,12};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bubbleSort(a);
	}
	
	public static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length;i++){
			
			for(int k=0;k<a.length;k++){
				if(a[i]<a[k]){//注意等號，由小到大排時，當比到小的時候要被換到前面去
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
			
		}
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
		
	}
	

}
