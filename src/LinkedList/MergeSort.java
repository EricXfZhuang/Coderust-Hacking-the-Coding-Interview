package LinkedList;

public class MergeSort {
    public static LinkedListNode mergeSort(LinkedListNode head) {
        //TODO: Write - Your - Code
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        if(slow != null){
            mergeSort(slow);
        }
        return head;
    }

    public static LinkedListNode merge(LinkedListNode leftHead, LinkedListNode rightHead){

    }
}
