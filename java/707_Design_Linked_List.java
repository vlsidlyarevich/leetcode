/**
 * Design_Linked_List.
 *
 * @author Vladislav Sidlyarevich
 * @since 30.08.2023
 */
class Design_Linked_List {

    static class MyLinkedList {

        int size;
        Node head;
        Node tail;

        public MyLinkedList() {
            this.size = 0;
//            this.head = new Node(0);
//            this.tail = new Node(0);
        }

        public int get(int index) {
            if (index < 0 && index >= size) return -1;

            var current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.value;
        }

        public void addAtHead(int val) {
            if (size == 0) {
                head = new Node(val);
                tail = head;
            } else {
                var prevHead = head;
                head = new Node(val);
                head.next = prevHead;
                prevHead.prev = head;
            }

            size++;
        }

        public void addAtTail(int val) {
            if (size == 0) {
                head = new Node(val);
                tail = head;
            } else {
                var prevTail = tail;
                tail = new Node(val);
                tail.prev = prevTail;
                prevTail.next = tail;
            }

            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) return;

            var current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            if (index == size) {
                addAtTail(val);
                return;
            } else if (index == 0) {
                addAtHead(val);
                return;
            }
            var newNode = new Node(val);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            var current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            if (current.prev != null) {
                current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;
            }

            if (index == 0) {
                head = current.next;
                if (head != null) head.prev = null;
            }
            if (index == size - 1) {
                tail = current.prev;
                if (tail != null) tail.next = null;
            }

            current.next = null;
            current.prev = null;
        }

        class Node {

            Node next;

            Node prev;

            Integer value;

            public Node(Integer value) {
                this.value = value;
            }
        }
    }
}
