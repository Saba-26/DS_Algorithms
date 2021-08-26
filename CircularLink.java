public class CircularLink {
    Node head;
    Node last;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public void insertAtFront(int data)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
            last=head;
            return;
        }

        new_node.next=head;
        head=new_node;
    }

    public void insertionAtLast(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            last=head;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        last=new_node;
    }

    public void lastToHead()
    {
        last.next=head;
    }

    public void print()
    {
       Node temp=head;
       while(temp.next!=head)
       {
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println(temp.data+"->"+temp.next.data);
    }
    
    public static void main(String[] args) {
        CircularLink cl=new CircularLink();
        cl.insertAtFront(10);
        cl.insertAtFront(20);
        cl.insertAtFront(30);
        cl.insertionAtLast(5);
        cl.lastToHead(); 
        cl.print();
    }
}
