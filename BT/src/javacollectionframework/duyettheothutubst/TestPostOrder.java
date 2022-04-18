package javacollectionframework.duyettheothutubst;

public class TestPostOrder {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(27);
        bst.root.left = new Node(14);
        bst.root.right = new Node(35);
        bst.root.left.left = new Node(10);
        bst.root.left.right = new Node(19);
        bst.root.right.left = new Node(31);
        bst.root.right.right = new Node(42);

        bst.postOrder();
    }
}
