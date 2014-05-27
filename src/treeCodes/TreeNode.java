/*
*   This is a generalized class that represents the structure of each node of a binary tree   
*
*   @author Ketan
*
*/

package treeCodes;

public class TreeNode {
	private int element;
	private TreeNode left, right;
	
	TreeNode(int element){
		this.element = element;
    this.left = null;
    this.right = null;
	}
	
	public int getElement(){
		return this.element;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
}
