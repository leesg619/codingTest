package inflearn_Search07;


public class TreeDFS {
    Node root;
    Node endNode;
    int shortest;
    // 말단까지의 최단경로
    public void dfs(Node root) {

    }

    public static void main(String[] args) {
        TreeDFS tree = new TreeDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.dfs(tree.root);
    }
}