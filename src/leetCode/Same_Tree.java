package leetCode;

public class Same_Tree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	public static void main(String[] args) {
		TreeNode t = new TreeNode(0);
//		t.left = new TreeNode(1);
		t.right = new TreeNode(2);

		TreeNode t2 = new TreeNode(0);
		t2.left = new TreeNode(1);
//		t2.right = new TreeNode(2);

		System.out.println(isSameTree(t, t2));
	}
}
