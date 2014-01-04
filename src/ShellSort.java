
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
				int j = i-r; //a[j]對應的左側數列,r剛好是跟i 的距離
				while(j>=0&&temp<a[j]){
					a[j+r]=a[j];//往右移動
					j=j-r;//從後面（右邊）開始比，從後面開始移才不會移動時洗掉本來的值
				}
				a[j+r] = temp;//若無執行到while，直接插入再最後一項
				//若有執行while,因為有j=j-r所以a[j+r]會插在前面（剛好符合條件temp<a[j]的j）
			}
		}
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+",");
		}
	}

}
