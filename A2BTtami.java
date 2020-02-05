package a2bttami;

import java.util.*;
public class A2BTtami<E>{
   private static class BNode<E>{
      int data;
      BNode parent;
      BNode left;
      BNode right;
      BNode(){
         this(0);
      }
      BNode(int e){
         data = e;
	 parent = null;
	 left = null;
	 right = null;
      }
   }
   private BNode root;
   private int size;
   A2BTtami(){
      root = null;
      size = 0;
   }
   public BNode createNode(int e){
      return new BNode(e);
   }
   public BNode addLeft(BNode n, int e) throws IllegalArgumentException{
      if (n.left != null) throw new IllegalArgumentException("Left is full");
      n.left = createNode(e);
      n.left.parent = n;
      size++;
      return n.left;
   }
   public BNode addRight(BNode n, int e) throws IllegalArgumentException{
      if (n.right != null) throw new IllegalArgumentException("Right is full");
      n.right = createNode(e);
      n.right.parent = n;
      size++;
      return n.right;
   }
   public BNode addRoot(int e) throws IllegalArgumentException{
      if (root != null) throw new IllegalArgumentException("Right is full");
      root = createNode(e);
      size++;
      return root;
   }
   public void levelOrder(){
      if (root == null) return; 
  
    Queue<BNode> q = new LinkedList<>();  
    q.add(root);  
    q.add(null); 
    while (!q.isEmpty()) {  //till queue becomes empty
      BNode temp = q.poll(); 
      if (temp == null) { 
        if (!q.isEmpty()) { 
          q.add(null); 
          
        } 
      } else { 
        if (temp.left != null) 
          q.add(temp.left); 
  
        if (temp.right != null) 
          q.add(temp.right); 
  
        System.out.print(temp.data + " ");
   }
    }
    }
  
   public void build(){
      BNode rt = addRoot(0);
      buildTree(rt, 1);
   }
   private void buildTree(BNode p, int i){
      if (i == 4) return;
      BNode lt = addLeft(p, size);
      BNode rt = addRight(p, size);
      buildTree(rt, i + 1);
      buildTree(lt, i + 1);
   }
   public static void main(String[] args){
      A2BTtami bt = new A2BTtami();
      bt.build();
      bt.levelOrder();
      //output: 0,1,2,9,10,3,4,13,14,11,12,7,8,5,6,
   }
}