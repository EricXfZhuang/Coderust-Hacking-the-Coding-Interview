package LinkedList;

/**
 * @Author EricZhuang
 * @Date 2020/8/9
 */
public class ReverseEven {
    public static LinkedListNode reverseEvenNodes(LinkedListNode head) {
        //TODO: Write - Your - Code
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }

        Pair p = splitEven(head);

        LinkedListNode oddHead = p.first;
        LinkedListNode evenHead = p.second;

        evenHead = reverse(evenHead);

        return merge(oddHead, evenHead);

    }

    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null || head.next == null){
            return head;
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

    public static LinkedListNode merge(LinkedListNode oddHead, LinkedListNode evenHead){
        if(oddHead == null){
            return evenHead;
        }else if(evenHead == null){
            return oddHead;
        }

        LinkedListNode curr = oddHead;
        LinkedListNode newHead = oddHead;
        int count = 2;

        while(oddHead != null && evenHead != null){
            if(count % 2 == 0){
                curr.next = evenHead;
                evenHead = evenHead.next;
            }else{
                curr.next = oddHead;
                oddHead = oddHead.next;
            }
            count++;
            curr = curr.next;
        }

        if(evenHead != null){
            curr.next = evenHead;
        }else{
            curr.next = oddHead;
        }

        return newHead;
    }


    public static Pair splitEven(LinkedListNode head){
        int count = 1;
        LinkedListNode oddHead = head;
        LinkedListNode evenHead = head.next;
        LinkedListNode oddCurr = oddHead;
        LinkedListNode  evenCurr = evenHead;

        head = head.next;
        while(head != null){
            count++;
            if(count % 2 == 0){
                evenCurr.next = head;
                evenCurr = evenCurr.next;
            }else{
                oddCurr.next = head;
                oddCurr = oddCurr.next;
            }
            head = head.next;
        }

        return new Pair(oddHead, evenHead);
    }

    static class Pair{
        public LinkedListNode first;
        public LinkedListNode second;

        public Pair(LinkedListNode first, LinkedListNode second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 14, 21, 28, 9};
        LinkedListNode listHead = LinkedList.createLinkedList(arr);
        System.out.print("Original list: ");
        LinkedList.display(listHead);

        listHead = reverseEvenNodes(listHead);
        System.out.print("After Reverse: ");
        LinkedList.display(listHead);
    }
}
