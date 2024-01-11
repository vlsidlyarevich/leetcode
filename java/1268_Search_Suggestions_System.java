import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Search_Suggestions_System.
 *
 * @author Vladislav Sidlyarevich
 * @since 13.12.2023
 */
class Search_Suggestions_Systems {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        var trie = new Trie();

        trie.insert(searchWord);

        List<List<String>> result = new ArrayList<>();

        Arrays.sort(products);

        for (int i = 0; i < searchWord.toCharArray().length; i++) {
            result.add(i, new ArrayList<>());
            int counter = 0;
            var subString = "";
            for (String product : products) {
                if (product.length() >= i + 1) {
                    subString = product.substring(0, i + 1);
                } else subString = product;

                if (counter == 3) break;

                if (trie.startsWith(subString)) {
                    result.get(i).add(product);
                    counter++;
                }

            }
        }


        return result;
    }

    class Trie {

        TrieNode root;

        public Trie() {
            this.root = new TrieNode(' ', false);
        }

        public void insert(String word) {
            if (word == null || word.isEmpty()) return;

            var node = root;

            for (char c : word.toCharArray()) {
                var existing = node.getNode(c);
                if (existing == null) {
                    existing = node.addNode(c, false);
                }

                node = existing;
            }

            node.setWord();
        }

        public boolean startsWith(String word) {
            var found = searchNode(word);
            return found != null;
        }

        public TrieNode searchNode(String word) {
            var node = root;
            for (char c : word.toCharArray()) {
                node = node.getNode(c);
                if (node == null) return null;
            }

            return node;
        }
    }

    class TrieNode {

        Character key;
        Map<Character, TrieNode> nodes = new HashMap<>();
        boolean isWord;

        public TrieNode(Character key, boolean isWord) {
            this.key = key;
            this.isWord = isWord;
        }

        public TrieNode getNode(Character key) {
            return nodes.get(key);
        }

        public void setWord() {
            isWord = true;
        }

        public TrieNode addNode(Character key, boolean isWord) {
            var toAdd = new TrieNode(key, isWord);
            nodes.put(key, toAdd);
            return toAdd;
        }
    }
}
