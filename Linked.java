//A simple JAva Program to introdue a LL

public class Linked {
     Node head;
     
     static class Node{
         int data;
         Node next;

         Node(int d)
         {
             data=d;
             next=null;
         }
     }

    public static void main(String[] args) {
        Linked l=new Linked();
        l.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        l.head.next=second;
        second.next=third;
    }
}
