import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Design_HashMap.
 *
 * @author Vladislav Sidlyarevich
 * @since 18.08.2023
 */
class MyHashMap {

    private int divider;
    private List<Bucket> buckets;

    public MyHashMap() {
        // Random one =/
        this.divider = 1239;
        this.buckets = new ArrayList<>();
        for (int i = 0; i < divider; i++) {
            this.buckets.add(new Bucket());
        }
    }

    public void put(int key, int value) {
        var bucket_index = key % divider;
        buckets.get(bucket_index).put(key, value);
    }

    public int get(int key) {
        var bucket_index = key % divider;
        return buckets.get(bucket_index).get(key);
    }

    public void remove(int key) {
        var bucket_index = key % divider;
        buckets.get(bucket_index).remove(key);
    }

    public class Bucket {

        private List<KeyValue<Integer, Integer>> keyValues;

        public Bucket() {
            this.keyValues = new LinkedList<>();
        }

        public void put(int key, int value) {
            for (KeyValue<Integer, Integer> keyValue : keyValues) {
                if (keyValue.key == key) {
                    keyValue.setValue(value);
                    return;
                }
            }

            keyValues.add(new KeyValue<>(key, value));
        }

        public int get(int key) {
            for (KeyValue<Integer, Integer> keyValue : keyValues) {
                if (keyValue.key == key) return keyValue.value;
            }

            return -1;
        }

        public void remove(int key) {
            var removeIndex = -1;
            for (int i = 0; i < keyValues.size(); i++) {
                KeyValue<Integer, Integer> keyValue = keyValues.get(i);
                if (keyValue.key == key) removeIndex = i;
            }

            if(removeIndex != -1) keyValues.remove(removeIndex);
        }
    }

    public class KeyValue<K, V> {

        private final K key;
        private V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
