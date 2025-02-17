package linkedlist;


class DNode{

    int data;
    DNode next;
    DNode back;

    DNode(int data, DNode next, DNode back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    DNode(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        DNode head = DoublyLinkedList.implementDL(arr);
        DNode temp = head;

        //DoublyLinkedList.deleteTail(head);
        //DNode NodeR = DoublyLinkedList.deleteKthElement(head, 7);

        //DNode NodeR = DoublyLinkedList.deleteNode(head, 5);

        //DoublyLinkedList.printLL(temp);

        //DNode newHead = DoublyLinkedList.insertHead(temp, 0);
       // DNode newTail = DoublyLinkedList.insertBeforeTail(temp, 6);

        //DNode newKth = DoublyLinkedList.insertAtKth(temp, 7, 0);

        DNode reversed = DoublyLinkedList.reverseDLL(temp);

        DoublyLinkedList.printLL(reversed);






    }

    public static DNode reverseDLL(DNode head){
        DNode temp = head;
        DNode prev = null;
        //now manipulate the nodes;

        while(temp!=null){

            prev = temp.back;
            temp.back = temp.next;
            temp.next= prev;

            temp = temp.back;

        }

        head = prev.back;

        return head;

    }


    public static void printLL(DNode head){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    //insert node before the head
    public static DNode insertHead(DNode head, int val){

        DNode newHead = new DNode(val, null, null);

        DNode temp = head;

        temp.back = newHead;
        newHead.next = temp;
        head = newHead;

        return head;
    }

    public static DNode insertBeforeTail(DNode head, int val){

        DNode newNode = new DNode(val, null, null);
        DNode temp = head;

        while(temp.next!=null){
            temp=temp.next;
        }

        DNode prev = temp.back;

        if(prev==null){
            return insertHead(head, val);
        }

        prev.next = newNode;
        newNode.back = prev;
        newNode.next = temp;
        temp.back = newNode;




        return head;
    }

    public static DNode insertAtKth(DNode head, int k, int val){
        if(k==1) return insertHead(head, val);
        int count =0;
        DNode temp = head;
        while(temp.next!=null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;
        }

        if(temp.next==null) return insertBeforeTail(head, val);

        DNode prev = temp.back;
        DNode newNode = new DNode(val, temp, prev);

        prev.next = newNode;
        temp.back = newNode;



        return head;
    }


    public static DNode implementDL(int[] arr){
        DNode head = new DNode(arr[0]);
        DNode prev = head;

        for(int i=1;i<arr.length;i++){
            DNode temp = new DNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }


        return head;
    }




    //deletion operations
    public static DNode deleteNode(DNode head, int data){
        DNode temp = head;

        while(temp!=null){
            if(temp.data==data){
                break;
            }
            temp=temp.next;
        }

        DNode prev = temp.back;
        DNode front = temp.next;

        if(front==null){
            prev.next = null;
        }else{
            prev.next = front;
            front.back = prev;
        }




        temp.next = null;
        temp.back = null;






        return head;
    }

    public static DNode deleteHead(DNode head){

        DNode prev = head;
        if(head== null || head.next==null) return null;

        head=head.next;
        head.back = null;
        prev.next=null;

        return head;

    }

    public static DNode deleteKthElement(DNode head, int k){
        DNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }

        DNode prev = temp.back;
        DNode front = temp.next;

        if(prev == null && front  ==null){
            return null;
        }else if(prev == null){
            return deleteHead(head);
        }else if(front == null){
            return deleteTail(head);
        }else{
            prev.next=front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }




        return head;
    }

    public static DNode deleteTail(DNode head){
        if(head==null || head.next==null) return null;

       DNode curr = head;

       while(curr.next!=null){


           curr = curr.next;
       }

      DNode prev = curr.back;
       prev.next = null;
       curr.back = null;





        return head;
    }
}
