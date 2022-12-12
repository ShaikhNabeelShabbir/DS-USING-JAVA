public class TreeTraversal {
    Node Root;
    void preordertraversal(Node n){
        if (n!=null) {
            System.out.print(n.key+"");
            preordertraversal(n.Left);
            preordertraversal(n.Right);
        }
    }
    void postordertraversal(Node n){
        if (n!=null) {
            preordertraversal(n.Left);
            preordertraversal(n.Right);
            System.out.print(n.key+"");
        }
    }
    void inordertraversal(Node n){
        if (n!=null) {
            preordertraversal(n.Left);
            System.out.print(n.key+"");
            preordertraversal(n.Right);
        }
    }
}
