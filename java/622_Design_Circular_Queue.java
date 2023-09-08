/**
 * Design_Circular_Queue.
 *
 * @author Vladislav Sidlyarevich
 * @since 08.09.2023
 */
class Design_Circular_Queue {

    class MyCircularQueue {

        Integer[] queue;
        int read = 0;
        int write = 0;
        int size = 0;

        public MyCircularQueue(int k) {
            queue = new Integer[k];
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                // This is not a circular buffer - it should overwrite old values instead
                return false;
            }
            if (write == queue.length) write = 0;

            queue[write++] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            queue[read++] = null;
            if (read == queue.length) {
                read = 0;
            }
            size--;
            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;

            return queue[read];
        }

        public int Rear() {
            if (isEmpty()) return -1;

            return queue[write - 1];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
           return size == queue.length;
        }
    }
}
