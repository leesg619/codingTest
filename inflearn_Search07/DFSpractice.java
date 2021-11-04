package inflearn_Search07;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class DFSpractice {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data);  // 전위 중위 후위 sout의 위치에 따라 달라짐 ( 직접 스택 그리면 더 이해 빠름 )
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        DFSpractice tree = new DFSpractice();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
