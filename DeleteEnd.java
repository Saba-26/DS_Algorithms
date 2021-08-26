public class DeleteEnd {
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

    public void deleteEnd()
    {
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
        //5--->6--->7-->null    (6.next=null)  5--->6-->null
        Node temp=head;
        while (temp.next.next!=null){//temp=6   temp.next=7  temp.next.next=null
            temp=temp.next;//
        }
        temp.next=null;
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
        DeleteEnd de=new DeleteEnd();

        de.insertBegin(4);
        de.insertBegin(3);
        de.insertBegin(2);
        de.insertBegin(1);

        de.print();
        System.out.println();
        de.deleteEnd();
        de.print();
    }
}
