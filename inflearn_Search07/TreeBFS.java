package inflearn_Search07;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {
    Node root;
    public int bfs(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                } else {
                    if (cur.lt != null) Q.offer(cur.lt);
                    if (cur.rt != null) Q.offer(cur.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        TreeBFS tree = new TreeBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        int shortest = tree.bfs(tree.root);
        System.out.println(shortest);
    }
}
