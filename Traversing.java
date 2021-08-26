public class Traversing {
    Node head;
    
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n=n.next;   
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Traversing t=new Traversing();

        t.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        t.head.next=second;
        second.next=third;

        t.print();
    }
}
