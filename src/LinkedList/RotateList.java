package LinkedList;

public class RotateList {
    public static LinkedListNode rotateList(LinkedListNode head, int n) {
        //TODO: Write - Your - Code
        int len = 0;
        LinkedListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        n %= len;

        // rotation
        curr = head;
        if(n == 0){
          return head;
        } else if(n > 0){
            int count = len - n;
            LinkedListNode prev = null;
            while(count > 0){
                prev = curr;
                curr = curr.next;
                count--;
            }
            LinkedListNode tail = curr;
            while(tail.next != null){
                tail = tail.next;
            }
            LinkedListNode newHead = curr;
            tail.next = head;
            prev.next = null;
            return newHead;
        }else{
            int count = 1;
            LinkedListNode nextHead = null;
            while(count < -n){
                count++;
                curr = curr.next;
                nextHead = curr.next;
            }
            LinkedListNode newHead = nextHead;
            while(nextHead.next != null){
                nextHead = nextHead.next;
            }
            curr.next = null;
            nextHead.next = head;
            return newHead;
        }
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        LinkedListNode listHead = LinkedList.createLinkedList(list1);

        System.out.print("Original list: ");
        LinkedList.display(listHead);

        listHead = rotateList(listHead, 2);
        System.out.print("List rotated by 2: ");
        LinkedList.display(listHead);
    }
}
