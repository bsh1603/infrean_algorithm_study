package chap7;

import java.util.LinkedList;
import java.util.Queue;

public class Main_07 {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        bfs(root);
    }

    static void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node tmp = queue.poll();
            System.out.print(tmp.data + " ");
            if(tmp.lt != null){
                queue.offer(tmp.lt);
            }
            if(tmp.rt != null){
                queue.offer(tmp.rt);
            }
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
