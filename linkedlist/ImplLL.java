package linkedlist;

class LL{
    int data;
    LL next;

    LL(int data, LL next){
        this.data=data;
        this.next=next;
    }

    LL(int data){
        this.data=data;
        this.next=null;
    }

}

public class ImplLL {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        LL head = ImplLL.implLinkedlist(arr);






        //print the LL
//           LL c = ImplLL.removesHead(temp);
//           LL s = ImplLL.removesTail(temp);

             LL b = ImplLL.removeKthElement(head, 6);
             LL c = ImplLL.removeValue(head, 0);


        while(c!=null){
            System.out.print(c.data+"->");
            c=c.next;
        }
        System.out.println();
        System.out.println("after inserting elements inserting elements");

        LL insertHead = ImplLL.insertAtHead(head, 10);

        LL insertAtPosition = ImplLL.insertAtPosition(head, 3, 2);

        while(insertAtPosition!=null){
            System.out.print(insertAtPosition.data+"->");
            insertAtPosition=insertAtPosition.next;
        }








    }
    //insertions
    private static LL insertAtHead(LL head, int value) {

        LL newNode = new LL(value);

        newNode.next = head;

        head=newNode;


        return head;
    }

    private static LL insertAtPosition(LL head, int value, int k) {
        LL newNode = new LL(value);

        if(head==null){ return newNode;}
        if(k==1){ newNode.next=head; return newNode;}


        LL current = head;
        int count = 0;
        while(current!=null ){
            count++;
            if(count==k-1){
                newNode.next=current.next;
                current.next=newNode;

            }

            current=current.next;

        }



        return head;
    }


    //deletions
    private static LL removeValue(LL head, int value) {

        if(head==null){ return head;}

        if(head.data==value){ return head.next;}


        LL curr = head;
        LL prev = null;
        while(curr!=null){

            if(curr.data==value){
                prev.next = prev.next.next;
                break;
            }
            prev = curr;
            curr=curr.next;
        }


        return head;
    }

    private static LL removeKthElement(LL head, int k) {
        if(head==null || k<=0){ return head;}
        if(k==1){ return head.next;}

        int count =0;
        LL curr = head;
        LL prev = null;
        while(curr!=null){
            count++;
            if(count==k){
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr=curr.next;
        }


        return head;
    }

    private static LL removesTail(LL head){

        if(head==null || head.next==null){ return null;}

        LL temp = head;
        LL prev = temp;
        while(temp!=null){

            if(temp.next==null){
                prev.next=null;
            }else{
                prev=temp;
            }

            temp=temp.next;

        }


        return head;
    }

    private static LL removesHead(LL head){




        return head.next;

    }

    //implementations
    private static LL implLinkedlist(int[] arr){

        LL head = new LL(arr[0]);
        LL current = head;
        for(int i=1;i<arr.length;i++){
            LL temp = new LL(arr[i]);
            current.next = temp;
            current = current.next;
        }

        return head;
    }
}
