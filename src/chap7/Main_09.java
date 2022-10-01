package chap7;

public class Main_09 {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(dfs(0, root));

    }

    static int dfs(int depth, Node root){
        int min = Integer.MAX_VALUE;
        if(root.lt == null && root.rt == null){
            return depth;
        }
        else{
            min = Math.min(dfs(depth+1, root.lt), dfs(depth+1, root.rt));
        }
        return min;
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
