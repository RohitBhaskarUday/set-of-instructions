package linkedlist;

class LLNode{
    String value;
    LLNode next;

    //now initialize the constructor when connecting nodes.
    LLNode(String value, LLNode next){
        this.value = value;
        this.next = next;
    }
    //Now initialize the constructor when the next is by default null or a detached node.
    LLNode(String value){
        this.value = value;
    }


}


public class ImplementLLTest {

    public static void main(String[] args) {

        String[] arr = {"robert","greene","is an","author","in Philosophy"};

        //implement the linked list. form the LL from the elements in the array.
        LLNode head = ImplementLLTest.implementLL(arr);
        LLNode temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
    }

    //how we implement the LinkedList.
    private static LLNode implementLL(String[] arr) {

        LLNode head = new LLNode(arr[0]);
        LLNode current = head;
        for(int i=1; i <arr.length; i++){
            LLNode temp = new LLNode(arr[i]);
            current.next = temp;
            current = current.next;
        }

        return head;
    }






}
