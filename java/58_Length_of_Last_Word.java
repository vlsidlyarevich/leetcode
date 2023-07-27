/**
 * Length_of_Last_Word.
 *
 * @author Vladislav Sidlyarevich
 * @since 24.07.2023
 */
class Length_of_Last_Word {

    public int lengthOfLastWord(String s) {
        var trimmedString = s.trim();
        return trimmedString.length() - trimmedString.lastIndexOf(' ') - 1;
    }
}
