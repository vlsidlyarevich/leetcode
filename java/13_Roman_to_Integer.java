import java.util.HashMap;

/**
 * Roman_to_Integer.
 *
 * @author Vladislav Sidlyarevich
 * @since 29.06.2023
 */
class Roman_to_Integer {

    public int romanToInt(String s) {
        var map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            var key = String.valueOf(s.charAt(i));
            if (i + 1 < s.length() && map.containsKey(key + s.charAt(i + 1))) {
                key = key + s.charAt(i + 1);
            }

            result += map.get(key);
        }

        return result;
    }
}
