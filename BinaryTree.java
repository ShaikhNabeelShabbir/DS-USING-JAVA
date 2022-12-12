public class BinaryTree {
    public static void main(String[] args) {
        TreeTraversal t1=new TreeTraversal();
        t1.Root=new Node('A');
        t1.Root.Left=new Node('B');
        t1.Root.Right=new Node('C');
        t1.Root.Left.Left=new Node('D');
        t1.Root.Right.Right=new Node('E');
        t1.Root.Left.Right=new Node('F');
        t1.Root.Right.Left=new Node('G');
        
        System.out.println("this is pre order");
        t1.preordertraversal(t1.Root);
        System.out.println("");
        System.out.println("this is in order");
        t1.inordertraversal(t1.Root);
        System.out.println("");
        System.out.println("this is post order");
        t1.postordertraversal(t1.Root);
    }
}
