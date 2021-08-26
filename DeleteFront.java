public class DeleteFront {
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
    }

    public void deleteAtFront(){
        //check list is empty
        if(head==null){
            System.out.println("Deletion is not possible");
            return;
        }
        // if list have only one element
        if(head.next==null){
            head=null;
            return;
        }
        // if list have more than one element
        head=head.next;
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
        DeleteFront d=new DeleteFront();
        //Node head=null;
        d.insertBegin(50);
        d.insertBegin(40);
        d.insertBegin(30);
        d.insertBegin(20);
        d.insertBegin(10);

        d.print();
        d.insertBegin(5);
        System.out.println();
        d.print();

        d.deleteAtFront();
        System.out.println();
        d.print();

        d.deleteAtFront();
        System.out.println();
        d.print();
    }
}
