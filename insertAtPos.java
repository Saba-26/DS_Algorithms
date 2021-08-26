public class insertAtPos {
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


    public Node insertingAtPos(Node head, int k ,int pos )
    {
        Node new_node=new Node(k);
        if(head==null){
            head=new_node;
            return head;
        }
        if(pos==1)
        {
            new_node.next=head;
            head=new_node;
            return head;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
        temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
        return head;
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
        insertAtPos ia=new insertAtPos();

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

        System.out.println();
        ia.head=ia.insertingAtPos(ia.head,5,1);
        ia.print();

        System.out.println();
        ia.head=ia.insertingAtPos(ia.head,35,6);
        ia.print();
    } 
}
