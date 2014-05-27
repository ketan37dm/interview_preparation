/*
*   PROBLEM STATEMENT
*   =================
*   Convert a given sorted array to a balanced binary tree
*
*   @author Ketan
*
*/

package treeCodes;

public class SortedArrayToBalancedBinaryTree {
	public static void main(String[] args) {
		SortedArrayToBalancedBinaryTree obj = new SortedArrayToBalancedBinaryTree();
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		int[] array2 = {1,2,3,4,5,6,7,8};
		
		//create a balanced binary tree
		TreeNode head = obj.createTree(array1);
		obj.traverse(head);
	}

	private TreeNode createTree(int[] tempArray) {
		// Terminating Condition
		if(tempArray.length < 1)
			return null;
		
		// Find the middle element
		int mid = tempArray[tempArray.length / 2];
		TreeNode head = new TreeNode(mid);
		
		// Split the array into two
		int[] first = new int[tempArray.length /2];
		int[] second = new int[tempArray.length - first.length -1];
		if(tempArray.length > 1){
			System.arraycopy(tempArray, 0, first, 0, first.length);
			System.arraycopy(tempArray, first.length+1, second, 0, second.length);
		}
		
		// call createTree and pass the left subArray to create left subTree
		head.setLeft(createTree(first));
		
		// call createTree and pass the right subArray to create right subTree
		head.setRight(createTree(second));
		
		return head;
	}
	
	private void traverse(TreeNode root){
		if(root != null){
			System.out.println(root.getElement());
			traverse(root.getLeft());
			traverse(root.getRight());
		}
	}
}
