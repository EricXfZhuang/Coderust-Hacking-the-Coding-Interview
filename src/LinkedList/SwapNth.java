package LinkedList;

public class SwapNth {
    // Node indices starts from 1.
    static LinkedListNode swapNthNode(LinkedListNode head, int n) {
        //TODO: Write - Your - Code
        LinkedListNode n_1_thNode = findN_1_th(head, n);
        LinkedListNode nthNode = n_1_thNode.next;
        LinkedListNode n_P_1thNode = nthNode.next;
        nthNode.next = head.next;
        n_1_thNode.next = head;
        head.next = n_P_1thNode;
        return nthNode;
    }

    static LinkedListNode findN_1_th(LinkedListNode head, int n){
        LinkedListNode prev = head;
        int index = 0;
        while(index != n-2){
            prev = prev.next;
            index++;
        }
        return prev;
    }

    /// Test Program.
    public static void main(String[] args) {
        LinkedListNode listHead = null;
        int[] arr = new int[] {7, 14, 21, 28, 35, 42};
        listHead = LinkedList.createLinkedList(arr);

        System.out.print("Original list: ");
        LinkedList.display(listHead);

        listHead = swapNthNode(listHead, 4);
        System.out.print("Swapping 4th node with head: ");
        LinkedList.display(listHead);
    }
}
