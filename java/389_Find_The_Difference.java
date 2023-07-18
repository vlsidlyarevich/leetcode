import java.util.Arrays;
import java.util.HashMap;

/**
 * Find_The_Difference.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.07.2023
 */
class Find_The_Difference {

    public char findTheDifference(String s, String t) {
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i] != tArr[i]) return tArr[i];
        }

        return tArr[t.length() - 1];
    }
}
