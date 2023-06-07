/**
 * Final_Value_of_Variable_After_Performing_Operations.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.06.2023
 */
class Final_Value_of_Variable_After_Performing_Operations {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String str: operations) {
            if(str.charAt(1) == '+') result++;
            else result--;
        }

        return result;
    }
}
