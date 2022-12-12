public class BST {
    public static void main(String[] args) {
        BinarySolution tree1=new BinarySolution();
        tree1.insertKey('n');
        tree1.insertKey('b');  
        tree1.insertKey('c');
        tree1.insertKey('a');   
        tree1.insertKey('x');   
        tree1.insertKey('y');   
        tree1.insertKey('z');   

        System.out.println("this is pre order");
        tree1.preordertraversal(tree1.root);
        System.out.println("");
        System.out.println("this is in order");
        tree1.inordertraversal(tree1.root);
        System.out.println("");
        System.out.println("this is post order");
        tree1.postordertraversal(tree1.root);
    }
}
