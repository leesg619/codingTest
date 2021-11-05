package inflearn_Search07;

import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root); //처음에 root넣어주고
        int L = 0; // level (root Node = Level 0)
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print("L = " + L+":  ");

            for (int i = 0; i < len; i++) {
                Node current = Q.poll();
                System.out.print(current.data + " ");
                if (current.lt!=null) Q.offer(current.lt);
                if (current.rt!=null) Q.offer(current.rt);
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        BFS1 tree = new BFS1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
