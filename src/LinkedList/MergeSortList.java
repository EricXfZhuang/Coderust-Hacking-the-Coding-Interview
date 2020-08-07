package LinkedList;

public class MergeSortList {
    public static LinkedListNode mergeSorted(LinkedListNode head1, LinkedListNode head2) {
        //TODO: Write - Your - Code
        LinkedListNode curr1 = head1;
        LinkedListNode curr2 = head2;
        LinkedListNode curr = null;

        if(curr1.data < curr2.data){
            curr = curr1;
            curr1 = curr1.next;
        }else{
            curr = curr2;
            curr2 = curr2.next;
        }
        LinkedListNode newHead = curr;
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data){
                curr.next = curr1;
                curr1 = curr1.next;
            }else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }

        if(curr1 != null){
            curr.next = curr1;
        }

        if(curr2 != null){
            curr.next = curr2;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 8, 15, 19, 22};
        int[] arr2 = new int[] {7, 9, 10, 16};
        LinkedListNode listHead1 = LinkedList.createLinkedList(arr1);
        System.out.print("List 1: ");
        LinkedList.display(listHead1);

        LinkedListNode listHead2 = LinkedList.createLinkedList(arr2);
        System.out.print("List 2: ");
        LinkedList.display(listHead2);

        System.out.print("Merged: ");
        LinkedListNode merge = mergeSorted(listHead1, listHead2);
        LinkedList.display(merge);
    }
}
