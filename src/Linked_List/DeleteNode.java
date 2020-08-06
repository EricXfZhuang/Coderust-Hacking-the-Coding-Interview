package Linked_List;

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
                    return head;
                }else{
                    prev.next = curr.next;
                    curr.next = null;
                    return head;
                }
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
