package javacollectionframework.duyettheothutubst;

public class BST {
    public Node root;


    public BST() {
        this.root = null;
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public void postOrder() {
        postOrder(root);
    }
}
