package linkedlist;

class  NodeLL{
    int data;
    NodeLL next;

    NodeLL(int data, NodeLL next) {
        this.data=data;
        this.next=next;
    }

    NodeLL(int data){
        this.data=data;
        this.next=null;
    }
}


public class PracticeLL {

    public static void main(String[] args) {


        int[] arr= {11,12,13,14,15};

        NodeLL head = PracticeLL.implementLL(arr);

        NodeLL temp = PracticeLL.revereLLRecursive(head);

        printLL(temp);



    }

    public static NodeLL revereLLRecursive(NodeLL head){

        if(head == null || head.next== null) return head;

        NodeLL newNode = revereLLRecursive(head.next);

        NodeLL front = head.next;
        front.next = head;
        head.next = null;

        return newNode;


    }


    public static NodeLL reverseLL(NodeLL head){
        NodeLL temp = head;
        NodeLL prev = null;

        while(temp!=null){

            NodeLL nextNode = temp.next;
            temp.next = prev;
            prev = temp;

            temp = nextNode;
        }


        return prev;
    }

    public static NodeLL deleteNode(NodeLL head){
        if(head==null) return null;
        NodeLL curr = head;
        NodeLL prev = curr;

        int k=13;

        int count =0;
        while(curr!=null){
            count++;
            if(curr.data==k){
                prev.next = curr.next;
            }
            prev = curr;
            curr=curr.next;
        }


        return head;
    }

    public static NodeLL implementLL(int[] arr) {

        NodeLL head = new NodeLL(arr[0]);
        NodeLL curr = head;
        for(int i=1; i<arr.length; i++){
            NodeLL temp = new NodeLL(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }

        return head;
    }

    public static void printLL(NodeLL head) {

        while(head!=null) {
            System.out.print(head.data+"->");
            head  = head.next;
        }

    }

}
