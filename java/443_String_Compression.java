/**
 * String_Compression.
 *
 * @author Vladislav Sidlyarevich
 * @since 01.10.2023
 */
class String_Compression {

    public int compress(char[] chars) {

        StringBuilder result = new StringBuilder();

        Character prev = null;
        int counter = 1;
        for (char aChar : chars) {
            if (prev == null) {
                prev = aChar;
                continue;
            }

            if (aChar == prev) counter++;
            else {
                result.append(prev);
                if (counter > 1) result.append(counter);
                counter = 1;
                prev = aChar;
            }
        }
        result.append(prev);
        result.append(counter > 1 ? counter : "");

        String resultString = result.toString();
        System.arraycopy(resultString.toCharArray(), 0, chars, 0, resultString.toCharArray().length);

        return resultString.length();
    }
}
