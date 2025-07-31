import java.util.LinkedList;
import java.util.Queue;

class node{
    int data;
    node left, right;

    public node(int data) {
        this.data = data;
    }
}
class BinaryTree {
    node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public node insertRec(node root, int data) {
        if (root == null) {
            root = new node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
    }

    public void postorderRec(node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void bfs() {
        if (root == null) return;
        Queue<node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public void countNodes() {
        System.out.println(countNodesRec(root));
    }

    public int countNodesRec(node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }
    public int height(node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public void printLeafNodes(node root) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.data + " ");
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }
    public int sumOfNodes(node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
}
public class trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();
        System.out.println("\nPreorder traversal of the binary tree:");
        tree.preorder();
        System.out.println("\nPostorder traversal of the binary tree:");
        tree.postorder();
        System.out.println("\nBFS traversal of the binary tree:");
        tree.bfs();
        System.out.println("\nTotal number of nodes in the binary tree: ");
        tree.countNodes();
        System.out.println("\nHeight of the binary tree: ");
        System.out.println(tree.height(tree.root));
        System.out.println("\nLeaf nodes in the binary tree: ");
        tree.printLeafNodes(tree.root);
        System.out.println("\nSum of all nodes in the binary tree: ");
        System.out.println(tree.sumOfNodes(tree.root));
    }
}
