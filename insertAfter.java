public class insertAfter {
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

    public void insertBegin(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return;
    }

    public void insertEnd(int data)
    {
        Node temp=new Node(data);

        if(head==null)
        {
            head=new Node(data);
            return;
        }
        //temp.next=null;

        Node last=head;
        while(last.next != null)
        {
            last=last.next;
        }
        last.next=temp;
        return;
       
    }
    
    public void insertingAfter(Node prev_node,int data)
    {
        if(prev_node == null)
        {
            System.out.println("Node cannot be null");
            return;
        }

        Node temp=new Node(data);
        temp.next=prev_node.next;
        prev_node.next=temp;
        return;
    }

    public void print()
    {
        Node n=head;
        while(n != null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insertAfter ia=new insertAfter();

        ia.insertBegin(30);
        ia.insertBegin(20);
        ia.insertBegin(10);
        
        ia.print();
        System.out.println();

        ia.insertEnd(40);
        ia.print();

        System.out.println();
        ia.insertingAfter(ia.head,15);
        ia.print();
    }
}

