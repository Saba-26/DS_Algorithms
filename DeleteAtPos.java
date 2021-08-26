public class DeleteAtPos {
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
    
    public void deleteAtPos(int position) 
    { 
        // If linked list is empty 
        if (head == null) 
            return; 

        // Store head node 
        Node temp = head; 

        // If head needs to be removed 
        if (position == 0) 
        { 
            head = temp.next; // Change head 
            return; 
        } 

        // Find previous node of the node to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 

        // If position is more than number of ndoes 
        if (temp == null || temp.next == null) 
            return; 

        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = temp.next.next; 

        temp.next = next; // Unlink the deleted node from list 
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
        DeleteAtPos dp=new DeleteAtPos();
        dp.insertBegin(50);
        dp.insertBegin(40);
        dp.insertBegin(30);
        dp.insertBegin(20);
        dp.insertBegin(10);
        dp.insertBegin(0);

        dp.deleteAtPos(3);
        dp.print();
    }
}
