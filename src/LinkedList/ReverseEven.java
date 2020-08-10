package LinkedList;

import org.junit.Test;

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

    public static LinkedListNode merge(LinkedListNode list1, LinkedListNode list2){
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        LinkedListNode head = list1;

        while (list1.next != null && list2 != null) {
            LinkedListNode temp = list2;
            list2 = list2.next;

            temp.next = list1.next;
            list1.next = temp;
            list1 = temp.next;
        }

        if (list1.next == null) {
            list1.next = list2;
        }

        return head;
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
            LinkedListNode temp = head.next;
            if(count % 2 == 0){
                evenCurr.next = head;
                evenCurr = evenCurr.next;
            }else{
                oddCurr.next = head;
                oddCurr = oddCurr.next;
            }
            head = temp;
        }
        oddCurr.next = null;
        evenCurr.next = null;
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

    @Test
    public void testSplitEven(){
        int[] arr = {7, 14, 21, 28, 9};
        LinkedListNode listHead = LinkedList.createLinkedList(arr);
        System.out.println("Original list: ");
        LinkedList.display(listHead);

        Pair pair = splitEven(listHead);
        System.out.println("odd list: ");
        LinkedList.display(pair.first);
        System.out.println("even list: ");
        LinkedList.display(pair.second);

        LinkedListNode reverseEven = reverse(pair.second);
        System.out.println("reversed even list: ");
        LinkedList.display(reverseEven);

        LinkedListNode mergedList = merge(pair.first, reverseEven);
        LinkedList.display(mergedList);
    }

}
