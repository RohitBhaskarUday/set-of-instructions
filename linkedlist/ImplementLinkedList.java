package linkedlist;


//this is the data type of LinkedList
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

}


public class ImplementLinkedList {

    public static void main(String[] args) {

        int[] arr = {10,10,10,10};

        Node head = new Node(arr[0]);
        Node current = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = current.next;
        }

        //never mess with the head
        Node temp = head;
        //print the LL
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println();
        //print the count of the LL
        System.out.println(ImplementLinkedList.lengthOfALinkedList(head)+" Length of the Linked List ");
        //print if the element exist or not
        System.out.println();
        System.out.print(ImplementLinkedList.searchElement(head, 20));

        //Delete a node in the LL
        System.out.println("After deleting");
        ImplementLinkedList.deleteNode(head, 10);
        Node temp1 = head;
        while(temp1!=null){
            System.out.print(temp1.data+"->");
            temp1 = temp1.next;
        }

    }
    private static void deleteNode(Node head, int val){
        Node current = head;
        Node prev = head;


        while(current!=null){

            if(current.data==val){
                prev.next = current.next;
            }else{
                prev = current;
            }

            current=current.next;

        }

    }

    private static boolean searchElement(Node head, int val){
        Node current = head;
        while(current!=null){
            if(current.data==val){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    private static int lengthOfALinkedList(Node head){
        int count =0;
        Node current = head;
        while(current!=null){
            count++;
            current = current.next;
        }

        return count;
    }




}


