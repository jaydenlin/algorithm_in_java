
public class ShellSort {

	/**
	 * @param args
	 */
	static int[] a={3,14,1,34,21,56,35,33,89,23,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shellSort(a);
	}
	
	public static void shellSort(int[] a) {
		
		//插入排序的變形
		
		//先分組再依序做插入排序
		//先兩個一組，再四個一組，再八個一組...直到全部一組
		for(int r=a.length/2;r>=1;r=r/2){
		
			for(int i=r;i<a.length;i++){
	
				int temp = a[i];//a[i]右側數列
				int j = i-r; //a[j]對應的左側數列
				while(j>=0&&temp<a[j]){
					a[j+r]=a[j];//往右移動
					j=j-r;//從右邊開始比
				}
				a[j+r] = temp;
			}
		}
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}

}
