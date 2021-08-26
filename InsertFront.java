public class InsertFront {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insertBegin(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
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
        InsertFront I=new InsertFront();
        //Node head=null;
        I.insertBegin(50);
        I.insertBegin(40);
        I.insertBegin(30);
        I.insertBegin(20);
        I.insertBegin(10);

        I.print();
        I.insertBegin(5);
        System.out.println();
        I.print();
    }
}
