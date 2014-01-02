public class BinaryTreeOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode rootNode = createNode("root");
		TreeNode aNode = createNode("a");
		TreeNode bNode = createNode("b");
		TreeNode cNode = createNode("c");
		TreeNode dNode = createNode("d");
		TreeNode eNode = createNode("e");
		TreeNode fNode = createNode("f");

		addNode(rootNode, aNode);
		addNode(rootNode, bNode);

		addNode(aNode, cNode);
		addNode(aNode, dNode);

		addNode(bNode, eNode);
		addNode(bNode, fNode);

		
		System.out.println(treeDepth(rootNode));
		System.out.println(findNode(rootNode, "c").data);

	}

	public static TreeNode createNode(String data) {
		TreeNode node = new TreeNode();
		node.data = data;
		return node;
	}

	public static void addNode(TreeNode parentNode, TreeNode childNode) {
		if (parentNode.leftChain == null) {
			parentNode.leftChain = childNode;
		} else if (parentNode.rightChain == null) {
			parentNode.rightChain = childNode;
		} else {
			System.out.println("addNode Fail");
		}

	}

	public static TreeNode findNode(TreeNode node, String data) {
		
		//前序拜訪的變形
		if (node == null) {
			//不用擔心左右子樹是否為null，因為在這裡傳進來的時候會處理掉
			return null;

		} else if (node.data.equals(data)) {

			return node;

		} else if (findNode(node.leftChain, data) != null) {//不為null才return,不然走不到右邊去

			return findNode(node.leftChain, data);

		} else if (findNode(node.rightChain, data) != null) {

			return findNode(node.rightChain, data);

		} else {
			return null;
		}

	}

	public static int treeDepth(TreeNode roottNode) {
		
		int depthLeft=0;
		int depthRight=0;
		
		if(roottNode==null){
			return 0;
			
		}else{
			depthLeft = treeDepth(roottNode.leftChain);
			depthRight = treeDepth(roottNode.rightChain);
			
			if(depthLeft>depthRight){
				return depthLeft=depthLeft+1;
			}else{
				return depthRight=depthRight+1;
			}
		}

	}

	public static void isTreeEmpth(TreeNode roottNode) {

	}

}
