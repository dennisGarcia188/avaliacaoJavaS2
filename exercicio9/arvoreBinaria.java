package business;

public class TesteArvore {
    
	public int sum(BinaryTree node) {
		int result = node.valor;
		if (node.left != null) {
			result += sum(node.left);
		}
		if (node.right != null) {
			result += sum(node.right);
		}
		return result;
	}
}

