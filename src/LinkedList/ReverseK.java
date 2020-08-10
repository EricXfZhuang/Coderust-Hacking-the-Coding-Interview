package LinkedList;

public class ReverseK {
    static LinkedListNode reverseKNodes(LinkedListNode head, int k) {
        //TODO: Write - Your - Code
        if(head == null){
            return null;
        }

        LinkedListNode curr = head;
        int count = 1;
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }

        LinkedListNode nextHead = null;
        if(curr != null){
            nextHead = curr.next;
            curr.next = null;
        }
        LinkedListNode reversedHead = reverseFirstKNodes(head);
        LinkedListNode tail = reversedHead;

        while(tail.next != null){
            tail = tail.next;
        }

        if(nextHead != null){
            tail.next = reverseKNodes(nextHead, k);
        }

        return reversedHead;
    }

    public static LinkedListNode reverseFirstKNodes(LinkedListNode head){
        if(head == null){
            return null;
        }

        LinkedListNode newHead = head;
        while(head != null){
            head = head.next;
        }

        return reverse(newHead);
    }

    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null){
            return null;
        }

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
        int[] v1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        LinkedListNode listHead = LinkedList.createLinkedList(v1);
        System.out.print("Original list: ");
        LinkedList.display(listHead);

        listHead = reverseKNodes(listHead, 4);
        System.out.print("List reversed by 4: ");
        LinkedList.display(listHead);
    }
}
