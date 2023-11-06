import java.util.Stack;

/**
 * Asteroid_Collision.
 *
 * @author Vladislav Sidlyarevich
 * @since 31.10.2023
 */
class Asteroid_Collision {

    public int[] asteroidCollision(int[] asteroids) {

        var stack = new Stack<Integer>();

        for (int asteroid : asteroids) {
            boolean shouldAddNewAsteroid = true;
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();
                } else {
                    if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                        stack.pop();
                    }
                    shouldAddNewAsteroid = false;
                    break;
                }
            }

            if (shouldAddNewAsteroid) stack.push(asteroid);
        }

        var result = new int[stack.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }
        return result;
    }
}
