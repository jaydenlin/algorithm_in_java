public class BinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.data = "root";
		TreeNode aNode = new TreeNode();
		aNode.data = "a";
		TreeNode bNode = new TreeNode();
		bNode.data = "b";
		TreeNode cNode = new TreeNode();
		cNode.data = "c";
		TreeNode dNode = new TreeNode();
		dNode.data = "d";
		TreeNode eNode = new TreeNode();
		eNode.data = "e";
		TreeNode fNode = new TreeNode();
		fNode.data = "f";

		root.leftChain = aNode;
		root.rightChain = bNode;

		aNode.leftChain = cNode;
		aNode.rightChain = dNode;

		bNode.leftChain = eNode;
		bNode.rightChain = fNode;

		System.out.print(isDataAtTree(root, "c"));

	}

	static boolean isDataAtTree(TreeNode treeNode, String data) {
		boolean isThere = false;
		if (treeNode.data.equals(data)) {
			isThere = true;
		} else if (treeNode.leftChain != null && isDataAtTree(treeNode.leftChain, data)) {
			isThere = true;
		} else if (treeNode.rightChain != null && isDataAtTree(treeNode.rightChain, data)) {
			isThere = true;
		} else {
			isThere = false;
		}

		return isThere;
	}
	

}
