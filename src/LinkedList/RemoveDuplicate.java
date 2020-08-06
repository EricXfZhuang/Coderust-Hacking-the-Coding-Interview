package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author EricZhuang
 * @Date 2020/8/6
 */
public class RemoveDuplicate {
    public static LinkedListNode removeDuplicates(LinkedListNode head) {
        //TODO: Write - Your - Code
        Set<Integer> set = new HashSet<Integer>();
        LinkedListNode curr = head;
        LinkedListNode prev = head;
        while(curr != null){
            if(curr == head){
                set.add(curr.data);
                curr = curr.next;
            } else if(set.contains(curr.data)){
                prev.next = curr.next;
                curr = curr.next;
            } else if(!set.contains(curr.data)){
                set.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] list1 = {4, 7, 4, 9, 7, 11, 4};
        int[] list1Expected = {4, 7, 9, 11};

        LinkedListNode listHead1 = LinkedList.createLinkedList(list1);
        LinkedListNode listHead1_expected = LinkedList.createLinkedList(list1Expected);

        System.out.print("Original: ");
        LinkedList.display(listHead1);
        listHead1 = removeDuplicates(listHead1);

        System.out.print("After removing duplicates: ");
        LinkedList.display(listHead1);
    }
}
