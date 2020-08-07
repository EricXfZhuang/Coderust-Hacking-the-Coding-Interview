package LinkedList;

public class NthFromLast {
    public static LinkedListNode findNthFromLast(LinkedListNode head, int n) {
        //Write - Your - Code
        LinkedListNode curr = head;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        curr = head;
        while(len != n){
            curr = curr.next;
            len--;
        }
        return curr;
    }

    public static void main(String[] args) {
        LinkedListNode listHead = null;
        int []arr = {7, 14, 21, 28, 35, 42};

        listHead = LinkedList.createLinkedList(arr);
        System.out.print("List: ");
        LinkedList.display(listHead);

        LinkedListNode temp = findNthFromLast(listHead, 3);
        System.out.println(String.format("3rd element from last: %d", temp.data));
    }
}
