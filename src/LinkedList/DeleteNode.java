package LinkedList;

/**
 * @Author EricZhuang
 * @Date 2020/8/6
 */
public class DeleteNode {
    public static LinkedListNode deleteNode(LinkedListNode head, int key) {
        //TODO: Write - Your - Code
        LinkedListNode curr = head;
        LinkedListNode prev = head;
        while(curr != null){
            if(curr.data == key) {
                if (curr == head) {
                    head = head.next;
                }else{
                    prev.next = curr.next;
                    curr.next = null;
                }
                return head;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode listHead = null;
        int[] list1 = {20, 14,36, 11, 72, 41};
        listHead = LinkedList.createLinkedList(list1);
        System.out.print("Original: ");
        LinkedList.display(listHead);

        listHead = deleteNode(listHead, 72);
        System.out.printf("After deleting 72 from list: ");
        LinkedList.display(listHead);
    }
}
