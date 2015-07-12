package leetCode;

public class MaximumDepthOfBinaryTree {
	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return (left > right) ? left + 1 : right + 1;
	}

	public static void main(String[] args) {
		TreeNode t = new TreeNode(0);
		// t.left = new TreeNode(1);
		t.right = new TreeNode(2);

		TreeNode t2 = new TreeNode(0);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(2);
		t2.right.left = new TreeNode(3);
		System.out.println(maxDepth(t2));
		Math.pow(1, 1);
	}
}
