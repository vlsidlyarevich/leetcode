import java.util.Arrays;
import java.util.Set;

/**
 * Reverse_Vowels_of_a_String.
 *
 * @author Vladislav Sidlyarevich
 * @since 22.09.2023
 */
class Reverse_Vowels_of_a_String {

    public String reverseVowels(String s) {
        var vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        var arr = s.toCharArray();

        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        boolean leftLetterFounded = false;
        boolean rightLetterFounded = false;

        while (leftPointer <= rightPointer) {
            if (vowels.contains(arr[leftPointer])) {
                leftLetterFounded = true;
            }
            if (vowels.contains(arr[rightPointer])) {
                rightLetterFounded = true;
            }

            if (leftLetterFounded && rightLetterFounded) {
                var temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;

                leftPointer++;
                leftLetterFounded = false;
                rightPointer--;
                rightLetterFounded = false;
            } else if (leftLetterFounded) {
                rightPointer--;
            } else if (rightLetterFounded) {
                leftPointer++;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        return new String(arr);
    }
}
