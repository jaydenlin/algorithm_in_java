import java.util.Random;


public class GraphOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphMatrix graphMatrix=createGraph(8, 20);
		printGraph(graphMatrix);
		visit(graphMatrix);

	}
	
	static class GraphMatrix{
		int maxNum=20;
		char[] vertex = new char[maxNum];
		int[][] weightEdge = new int[maxNum][maxNum];
		boolean[] isVisited = new boolean[maxNum];
	}
	
	public static GraphMatrix createGraph(int vertexNum,int edgeNum) {
		int edgelimit = edgeNum;
		Random random = new Random();
		GraphMatrix graphMatrix = new GraphMatrix();
		graphMatrix.vertex = new char[vertexNum];
		graphMatrix.weightEdge = new int[vertexNum][vertexNum];
		graphMatrix.isVisited = new boolean[vertexNum];
		
		for(int i=0;i<vertexNum;i++){
			for(int k=0;k<vertexNum;k++){
				if(random.nextBoolean()&&edgelimit>0){
					graphMatrix.weightEdge[i][k] = (int)(random.nextDouble()*9+1);//1-9
					edgelimit=edgelimit-1;
				}else{
					graphMatrix.weightEdge[i][k] = 0;
				}		
			}
		}
		
		return graphMatrix;
		
	}
	
	public static void printGraph(GraphMatrix graphMatrix) {
		
		int vertexNum = graphMatrix.vertex.length;
		for(int i=0;i<vertexNum;i++){
			for(int k=0;k<vertexNum;k++){
				System.out.print(graphMatrix.weightEdge[i][k]);
			}
			System.out.println("");
		}
	}
	
	public static void visit(GraphMatrix graphMatrix){
		
		for(int i=0;i<graphMatrix.vertex.length;i++){
			if(graphMatrix.isVisited[i]!=true){//要加上判斷才對
				deepFirstVisit(graphMatrix,i);
			}
		}
		
	}
	
	
	public static void deepFirstVisit(GraphMatrix graphMatrix,int index){
		
		graphMatrix.isVisited[index]=true;
		System.out.println("=>"+index);
		for(int k=0;k<graphMatrix.vertex.length;k++){
			if(graphMatrix.weightEdge[index][k]!=0&&graphMatrix.isVisited[k]==false){
				deepFirstVisit(graphMatrix, k);
			}
		}
		
	}
	
	

}
