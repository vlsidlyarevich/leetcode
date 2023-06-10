/**
 * Maximum_Number_Of_Words_Found_in_Sentences.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.06.2023
 */
class Maximum_Number_Of_Words_Found_in_Sentences {

    public int mostWordsFound(String[] sentences) {
        int largestSpaces = 0;

        int spacesInSentence;
        for (String sentence : sentences) {
            spacesInSentence = 0;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') spacesInSentence++;
            }

            if (spacesInSentence > largestSpaces) largestSpaces = spacesInSentence;
        }

        return largestSpaces + 1;
    }
}
