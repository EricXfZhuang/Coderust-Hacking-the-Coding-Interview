package LinkedList;

public class AddIntegers {
    static LinkedListNode addIntegers(LinkedListNode integer1, LinkedListNode integer2) {
        //TODO: Write - Your - Code
        integer1 = reverse(integer1);
        integer2 = reverse(integer2);

        LinkedListNode curr1 = integer1;
        LinkedListNode curr2 = integer2;
        LinkedListNode newHead = new LinkedListNode(0);
        LinkedListNode curr = newHead;

        int carry = 0;
        while(curr1 != null && curr2 != null){
            int sum = carry + curr1.data + curr2.data;
            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
            curr = curr.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        if(curr1 != null){
            int sum = carry + curr1.data;
            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
        }else if(curr2 != null){
            int sum = carry + curr2.data;
            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
        }
        curr = curr.next;

        if(carry > 0){
            curr.next = new LinkedListNode(carry);
        }

        return newHead.next;
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

        int[] v1 = new int[]{9, 9, 0, 1}; // 1099
        int[] v2 = new int[]{2, 3, 7}; // 732

        LinkedListNode first = LinkedList.createLinkedList(v1);
        LinkedListNode second = LinkedList.createLinkedList(v2);

        LinkedListNode result = addIntegers(first, second);

        System.out.printf("First integer: ");
        LinkedList.display(first);
        System.out.printf("Second integer: ");
        LinkedList.display(second);

        System.out.printf("Result: ");
        LinkedList.display(result);
    }
}
