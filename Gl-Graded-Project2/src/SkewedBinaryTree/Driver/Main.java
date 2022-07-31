package SkewedBinaryTree.Driver;
import SkewedBinaryTree.Services.Node;
import SkewedBinaryTree.Services.SkewTree;

public class Main {

	public static void main(String[] args) {

		SkewTree tree = new SkewTree();
		
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left =new Node(55);
		
		
		
		tree.converstion(tree.root);
		tree.inOrder(tree.headNode);

	}

}