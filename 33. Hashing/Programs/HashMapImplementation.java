import java.util.*;

public class HashMapImplementation {

    static class HashMap<K, V> { // Generic class to allow different key-value types

        private class Node { // Represents each key-value pair
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total number of elements in the HashMap
        private int N; // Total number of buckets (size of the array)
        private LinkedList<Node> buckets[]; // Array of linked lists to handle collisions

        @SuppressWarnings("unchecked") // Suppresses unchecked type warnings for generic array creation
        public HashMap() {
            this.N = 4; // Initial size of the bucket array
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // Initialize each bucket with an empty linked list
            }
        }

        // Hash function to determine the index for a given key
        private int hashFunction(K key) {
            int hc = key.hashCode(); // Compute hash code for the key
            return Math.abs(hc) % N; // Ensure the index is within bounds and non-negative
        }

        // Searches for a key in the linked list at a given bucket index
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; // Retrieve the linked list at bucket index 'bi'
            int di = 0; // Data index within the linked list

            for (Node node : ll) {
                if (node.key==key) {
                    return di; // Return index if key is found
                }
                di++;
            }
            return -1; // Return -1 if key is not found
        }

        // Rehashing: Doubles the bucket size when the load factor exceeds the threshold
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets; // Store old buckets
            buckets = new LinkedList[N * 2]; // Double the array size
            N = N * 2; // Update N to reflect the new bucket size

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>(); // Initialize new bucket array
            }

            // Reinsert all nodes from old buckets into the new buckets
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        // Inserts or updates a key-value pair
        public void put(K key, V value) {
            int bi = hashFunction(key); // Compute bucket index
            int di = SearchInLL(key, bi); // Check if the key already exists in the bucket

            if (di != -1) {
                buckets[bi].get(di).value = value; // Update value if key exists
            } else {
                buckets[bi].add(new Node(key, value)); // Insert new key-value pair
                n++; // Increment element count
            }

            // Check if rehashing is needed
            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) { // Threshold for rehashing
                rehash();
            }
        }

        // Checks if a key exists in the HashMap
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            return SearchInLL(key, bi) != -1; // Returns true if key is found
        }

        // Removes a key-value pair from the HashMap
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di); // Remove node from linked list
                n--; // Decrease element count
                return node.value; // Return removed value
            }
            return null; // Return null if key is not found
        }

        // Retrieves the value associated with a key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value; // Return value if key exists
            }
            return null; // Return null if key does not exist
        }

        // Returns a list of all keys in the HashMap
        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // Checks if the HashMap is empty
        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);

        // Print all keys in the HashMap
        for (String key : hm.keyset()) {
            System.out.println(key);
        }

        // Retrieve and print value for key "five"
        System.out.println(hm.get("five"));
        
        // Remove key "five" and check if it's removed
        hm.remove("five");
        System.out.println(hm.get("five")); // Should print null
    }
}
