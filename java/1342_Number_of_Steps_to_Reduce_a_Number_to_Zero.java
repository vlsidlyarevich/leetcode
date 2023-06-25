/**
 * Number_of_Steps_to_Reduce_a_Number_to_Zero.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.06.2023
 */
class Number_of_Steps_to_Reduce_a_Number_to_Zero {

    public int numberOfSteps(int num) {

        var binaryRepresentation = Integer.toBinaryString(num);
        var steps = 0;

        for (char c : binaryRepresentation.toCharArray()) {
            if (c == '1') steps += 2;
            else steps += 1;
        }

        return steps - 1;
    }
}
