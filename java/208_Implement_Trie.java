import java.util.Optional;

/**
 * Implement_Trie.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.12.2023
 */
class Implement_Trie {


    class Trie {

        TrieNode root;

        public Trie() {
            this.root = new TrieNode(' ', false);
        }

        public void insert(String word) {
            if (word == null || word.isEmpty()) return;

            var node = root;

            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                var existingNode = node.getNode(c);

                if (existingNode == null) {
                    existingNode = node.addNode(c, i + 1 == charArray.length);
                }

                node = existingNode;
            }

            node.setKey();
        }

        public boolean search(String word) {
            if (word == null || word.isEmpty()) return false;

            var node = searchNode(word);
            return node != null && node.isKey();
        }

        public boolean startsWith(String prefix) {
            if (prefix == null || prefix.isEmpty()) return true;

            var node = searchNode(prefix);
            return node != null;
        }

        public TrieNode searchNode(String word) {

            var node = root;

            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                node = node.getNode(c);
                if (node == null) return null;
            }

            return node;
        }
    }

    class TrieNode {

        Character symbol = ' ';
        boolean isKey = false;
        TrieNode[] nodes = new TrieNode[26];

        public TrieNode(Character symbol, boolean isKey) {
            this.symbol = symbol;
            this.isKey = isKey;
        }

        public boolean isKey() {
            return isKey;
        }

        public void setKey() {
            isKey = true;
        }

        public TrieNode getNode(Character c) {
            return nodes[c - 'a'];
        }

        public TrieNode addNode(Character c, boolean isKey) {
            var result = new TrieNode(c, isKey);
            this.nodes[c - 'a'] = result;
            return result;
        }
    }
}
