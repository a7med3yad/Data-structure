public class Node{
    int info;
    Node next;
    Node prev;
    public Node(){
        next=null;
        info=0;
    }
    public Node(int el, Node n) {
        info = el;
        next = n;
    }
    public Node(int el) {
        info = el;
    }
    
}