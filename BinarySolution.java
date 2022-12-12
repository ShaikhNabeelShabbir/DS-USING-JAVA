public class BinarySolution {
    Node root;
    public void insertKey(char key) {
        root=insertintree(root,key);
    }

    Node insertintree(Node root,char key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if (key<root.key) {
            root.Left=insertintree(root.Left, key);
        }
        else if (key>root.key) {
            root.Right=insertintree(root.Right, key);
        }
        return root;
    }
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
