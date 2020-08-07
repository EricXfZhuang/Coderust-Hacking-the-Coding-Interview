package LinkedList;

public class Intersect {
    public static LinkedListNode intersect(LinkedListNode head1, LinkedListNode head2) {
        //TODO: Write - Your - Code
        LinkedListNode curr1 = head1;
        LinkedListNode curr2 = head2;

        int len1 = 1;
        int len2 = 1;

        while(curr1.next != null){
            curr1 = curr1.next;
            len1++;
        }

        while(curr2.next != null){
            curr2 = curr2.next;
            len2++;
        }

        if(len1 > len2){
            curr2.next = head2;
        }else{
            curr1.next = head1;
        }

        curr1 = curr1.next;
        curr2 = curr2.next;

        if(curr1 == curr2){
            if(len1 > len2){
                int diff = len1 - len2;
                while(diff > 0){
                    curr2 = curr2.next;
                    diff--;
                }
                return curr2;
            }else{
                int diff = len2 - len1;
                while(diff > 0){
                    curr1 = curr1.next;
                    diff--;
                }
                return curr1;
            }
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        int [] a1 = {13,4};
        int [] a2 = {29, 23, 82, 11};
        LinkedListNode list_head_1 = LinkedList.createLinkedList(a1);
        LinkedListNode list_head_2 = LinkedList.createLinkedList(a2);
        LinkedListNode node1 = new LinkedListNode(12);
        LinkedListNode node2 = new LinkedListNode(27);

        LinkedList.insertAtTail(list_head_1, node1);
        LinkedList.insertAtTail(list_head_1, node2);

        LinkedList.insertAtTail(list_head_2, node1);

        System.out.print("List 1: ");
        LinkedList.display(list_head_1);
        System.out.print("List 2: ");
        LinkedList.display(list_head_2);

        LinkedListNode intersect_node = intersect(list_head_1, list_head_2);
        System.out.println(String.format("Intersect at %d", intersect_node.data));
    }
}
