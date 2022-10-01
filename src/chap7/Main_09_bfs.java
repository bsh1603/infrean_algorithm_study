package chap7;

import java.util.LinkedList;
import java.util.Queue;

public class Main_09_bfs {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        bfs();
    }

    static void bfs(){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;

        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node curr = queue.poll();
                if(curr.lt == null && curr.rt == null){
                    System.out.println(l);
                    queue.clear();
                    break;
                }
                if(curr.lt != null){
                    queue.offer(curr.lt);
                }
                if(curr.rt != null){
                    queue.offer(curr.rt);
                }
            }
            l++;
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
