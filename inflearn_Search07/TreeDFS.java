package inflearn_Search07;

//말단노드까지최단경로를 구하는 것이기 때문에 dfs보다 bfs로 해야 되지만 연습용임. (else 호출시 root.lt, root.rt 호출하므로 트리는 완전해야함.rt나 lt 둘중하나 없는구조면 안됨)
public class TreeDFS {
    Node root;

    public int dfs(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        TreeDFS tree = new TreeDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        int shortest = tree.dfs(0, tree.root);
        System.out.println(shortest);
    }
}