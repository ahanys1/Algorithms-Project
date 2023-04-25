package bfs;

// 
// Hello there
// Wassup
// Class 4/19/2023


import java.util.*;

public class bfsTest {
	public static void main(String[] args){
		  Tree bst = new Tree();
		  bst.insert(50);
		  bst.insert(25);
		  bst.insert(18);
		  bst.insert(45);
		  bst.insert(80);
		  bst.insert(69);
		  
		  
		  bst.breadthSearch();
	}
	
}

//Tree Class
	class Tree {

		    // Node definition
		    class Node {
		        int key;
		        Node left;
		        Node right;

		        public Node(int data){
		            key = data;
		            left = null;
		            right = null;
		        }
		    }
		    // initialize root Node
		    Node root;

		    // constructor for tree class
		    Tree(){
		        root = null;
		    }
		    // The above creates both the tree and the first Node in the tree.

		    //inserting elements
		    void insert(int key){
		        root = insertRec(root, key);
		    }

		    Node insertRec(Node root, int key){
		        //if tree is empty
		        if (root == null){
		            root = new Node(key);
		            return root;
		        }
		        
		        // if tree is not empty
		        if (key < root.key){
		            root.left = insertRec(root.left, key);
		        }
		        else if (key > root.key){
		            root.right = insertRec(root.right, key);
		        }
		        return root;
		    }
		  
		// Breadth First Search algorithm
		    void bfs(Node root){
		        Queue<Node> queue = new LinkedList<Node>();
		        queue.add(root);
		        while (!queue.isEmpty()){
		            Node temp = queue.poll();
		            System.out.print(temp.key + " ");
		            if (temp.left != null){
		                queue.add(temp.left);
		            }
		            if (temp.right != null){
		                queue.add(temp.right);
		            }
		        }
		    }
		  	void breadthSearch(){
		        bfs(root);
		    }
		}


		//https://github.com/ahanys1/CMPT-220L-903-21S/tree/MyMain/Final_Project/src
		// 





