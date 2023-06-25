import java.util.ArrayList;
import java.util.List;

/**
 * Design_an_Ordered_Stream.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.06.2023
 */
class Design_an_Ordered_Streams {

    class OrderedStream {

        int pointer = 0;
        String[] stream;

        public OrderedStream(int n) {
            stream = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            stream[idKey - 1] = value;

            if (stream[pointer] == null) return List.of();

            List<String> result = new ArrayList<>();
            result.add(stream[pointer]);

            while (pointer < stream.length && stream[pointer] != null) {
                pointer++;
                result.add(stream[pointer]);
            }

            return result;
        }
    }
}
