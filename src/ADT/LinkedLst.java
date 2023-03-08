package ADT;

import java.util.LinkedList;


public class LinkedLst<T> {
    Node currentNode;
    T t;




    public  LinkedLst(T t, String nodeVal) {
        this.currentNode = new Node();
        this.currentNode.nodeValue = nodeVal;
        this.t = t;
    }

    public  LinkedLst(String nodeVal) {
        this.currentNode = new Node();
        this.currentNode.nodeValue = nodeVal;
        System.out.println("current node in cons" + this.currentNode);

    }

    public boolean delete(String nodeVal) {
        if (this.currentNode != null) {
            this.currentNode.nodeValue = nodeVal;
            this.currentNode = null;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedLst l = new LinkedLst("data");
        boolean b = l.delete("data");
        System.out.println(b);


    }

    class Node {
        Node nextNode;
        Node currentNode;
        String nodeValue;

        public void Node(String nodeValue) {
            this.nodeValue = nodeValue;

        }

        public void Node() {

        }


    }
}
