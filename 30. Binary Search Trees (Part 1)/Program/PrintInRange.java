class Node {
    int val;
    Node left, right;

    public Node(int item) {
        val = item;
        left = right = null;
    }
}

class PrintInRange {
    Node root;

    void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // Case 1: Root is within the range
        if (k1 <= root.val && root.val <= k2) {
            printRange(root.left, k1, k2); // Explore left subtree
            System.out.print(root.val + " "); // Print the current node
            printRange(root.right, k1, k2); // Explore right subtree
        }
        // Case 2: Root is smaller than k1, go to the right subtree
        else if (root.val < k2) {
            printRange(root.right, k1, k2);
        }
        // Case 3: Root is greater than k2, go to the left subtree
        else {
            printRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        PrintInRange tree = new PrintInRange();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(18);

        int k1 = 11, k2 = 18;
        System.out.println("Nodes in range [" + k1 + ", " + k2 + "]:");
        tree.printRange(tree.root, k1, k2);
    }
}
