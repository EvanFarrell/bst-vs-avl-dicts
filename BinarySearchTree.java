public class BinarySearchTree <E, K extends Sortable> {

  private BSTNode<E, K> root;

  public void createBinaryTree(BSTNode rootItem, BSTNode leftTree, BSTNode rightTree){
    rootItem.setLeft(leftTree);
    rootItem.setRight(rightTree);
  }

  public BinarySearchTree(BSTNode rootItem){
    root = rootItem;
    createBinaryTree(rootItem, null, null);
  }



  public static void main (String[] args){
    System.out.println("Hello world");
  }



}
