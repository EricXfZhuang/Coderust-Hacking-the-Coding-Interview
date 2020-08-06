package LinkedList;

/**
 * @Author EricZhuang
 * @Date 2020/8/6
 */
public class Reverse {
    public static LinkedListNode reverse(LinkedListNode head) {
        //TODO: Write - Your - Code
        LinkedListNode newHead = null;
        while(head != null){
            LinkedListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode listHead = null;
        int [] arr = {7,14,21,28};
        listHead = LinkedList.createLinkedList(arr);

        System.out.print("Original: ");
        LinkedList.display(listHead);

        listHead = reverse(listHead);
        System.out.print("After Reverse: ");
        LinkedList.display(listHead);
    }
}
