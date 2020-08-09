package LinkedList;

import javax.sound.sampled.Line;

public class MergeSort {
    public static LinkedListNode mergeSort(LinkedListNode head) {
        //TODO: Write - Your - Code
        if(head == null || head.next == null){
            return head;
        }

        Pair<LinkedListNode> pair = splitHalf(head);

        pair.first = mergeSort(pair.first);
        pair.second = mergeSort(pair.second);

        return merge(pair.first, pair.second);
    }

    public static Pair<LinkedListNode> splitHalf(LinkedListNode head){
        if(head == null){
            return null;
        }


       if(head.next == null){
           return new Pair<LinkedListNode>(head, null);
       }else{
           LinkedListNode slow = head, fast = head.next;

           while(fast != null){
               fast = fast.next;

               if (fast != null) {

                   fast = fast.next;
                   slow = slow.next;
               }
           }

           Pair<LinkedListNode> pair = new Pair<LinkedListNode>(head, slow.next);
           slow.next = null;

           return pair;
       }
    }

    public static LinkedListNode merge(LinkedListNode leftHead, LinkedListNode rightHead){
        LinkedListNode newHead = null;

        if(leftHead == null){
            return rightHead;
        }else if(rightHead == null){
            return leftHead;
        }

        if(leftHead.data <= rightHead.data){
            newHead = leftHead;
            leftHead = leftHead.next;
        }else{
            newHead = rightHead;
            rightHead = rightHead.next;
        }

        LinkedListNode curr = newHead;

        while(leftHead != null && rightHead != null){
            LinkedListNode temp = null;
            if(leftHead.data <= rightHead.data){
                temp = leftHead;
                leftHead = leftHead.next;
            }else{
                temp = rightHead;
                rightHead = rightHead.next;
            }
            curr.next = temp;
            curr = curr.next;
        }

        if(leftHead != null){
            curr.next = leftHead;
        }
        if(rightHead != null){
            curr.next = rightHead;
        }

        return newHead;
    }

    static class Pair<E>{
        public E first;
        public E second;

        public Pair(E first, E second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        int[] v1 = {29, 23, 82, 11, 4, 3, 21};
        LinkedListNode listHead1 = LinkedList.createLinkedList(v1);

        System.out.print("Unsorted list: ");
        LinkedList.display(listHead1);

        listHead1 = mergeSort(listHead1);
        System.out.print("Sorted list: ");
        LinkedList.display(listHead1);
    }
}
