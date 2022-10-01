package chap7;

public class Main_05 {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        dfs(root);
    }

    static void dfs(Node root){
        if(root == null) return;
        else{
            // 전위 순회 : System.out.print(root.data + " ");
            dfs(root.lt);
            // 중위 순회 : System.out.print(root.data + " ");
            dfs(root.rt);
            System.out.print(root.data + " ");
        }
    }

    static class Node{
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = null;
            rt = null;
        }
    }
}
