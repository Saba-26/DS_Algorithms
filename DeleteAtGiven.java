public class DeleteAtGiven {
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

    public void DeleteAGivenNode(int data){
        if(head.data==data){
            insertBegin(data);
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.data!=data) {//  null
            temp=temp.next;
        }
        //5--->6--->7-->8-->null    6.next.data 7
        if(temp.next==null && temp.data==data){
            insertEnd(data);
            return;
        }
        if(temp.next==null && temp.data!=data){
            System.out.println("Element not found");
            return;
        }
       temp.next=temp.next.next;
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
        DeleteAtGiven dg = new DeleteAtGiven();
        dg.insertBegin(5);
        dg.insertBegin(4);
        dg.insertBegin(3);
        dg.insertBegin(2);
        dg.insertBegin(1);
        dg.insertBegin(0);
  
        dg.DeleteAGivenNode(3);

        dg.print();
    }
}
