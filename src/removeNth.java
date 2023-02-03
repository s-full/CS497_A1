public class removeNth {

    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };
    static Node head;

    public static Node removeNth(Node head, int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        if (first == null) {
            head = head.next;
        }
        else {
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            second.next = second.next.next;
        }

        return head;
    }
}
