public class InsertEnd {
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
        InsertEnd ie=new InsertEnd();

        ie.insertBegin(50);
        ie.insertBegin(40);
        ie.insertBegin(30);
        ie.insertBegin(20);
        ie.insertBegin(10);
        

        //ie.print();
        //System.out.println();
        ie.insertEnd(60);
        ie.print();
        System.out.println();
        ie.insertEnd(70);
        ie.print();
 
        System.out.println();
        ie.insertBegin(5);
        ie.print();


    }
}
